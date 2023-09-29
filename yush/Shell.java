package com.process;
import java.lang.Object;
import java.lang.ProcessBuilder;
import java.lang.Process;
import java.lang.Runtime;
import java.lang.ProcessBuilder.Redirect;
import java.util.Map;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class Shell {
    Shell() {
        File rc_file = new File(System.getProperty("user.dir") + "/.yushrc");
        if (rc_file.exists()) {
            try {
                List<String> lines = Files.readAllLines(rc_file.toPath(), StandardCharsets.UTF_8);
                for (String line : lines) {
                    exec_cmd(line);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static int status = 0;

    private static String gen_path() {
        String home = System.getProperty("user.home");
        String dir = System.getProperty("user.dir");

        if (dir.substring(0, home.length()).equals(home)) {
            return "~" + dir.substring(home.length(), dir.length());
        }

        return dir;
    }

    private static int exec_cmd(String line) {
        if (line == null) {
            return 0;
        }

        String[] tokens = line.split(" ");
        if (tokens.length == 0) {
            return 0;
        }

        String cmd = tokens[0];
        String[] cmd_args = new String[tokens.length - 1];
        for (int i = 1; i < tokens.length; i++) {
            cmd_args[i - 1] = tokens[i];
        }

        if (cmd.equals("cd")) {
            cmd_cd(cmd_args);
        } else if (cmd.equals("exit")) {
            cmd_exit(cmd_args);
        } else {
            try {
                String cmd_path = null;
                String path = System.getenv("PATH");
                String[] path_tokens = path.split(":");

                ProcessBuilder pb = new ProcessBuilder(tokens);
                Map<String, String> env = pb.environment();
                pb.redirectInput(Redirect.INHERIT);
                pb.redirectOutput(Redirect.INHERIT);
                env.put("PATH", path);

                Process p = pb.start();
                status = p.waitFor();

                env.clear();
                status = 0;
            } catch (IOException e) {
                System.err.println(e.getMessage());
                status = 1;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                status = 1;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        do {
            if (status != 0) {
                System.out.print(status);
            }

            System.out.print(
                System.getProperty("user.name") +
                "@" + " " +
                gen_path() + " > "
            );

            String line = System.console().readLine();
            exec_cmd(line);
        } while (true);
    }

    private static int cmd_cd(String args[]) {
        String[] tokens = args[0].split("/");

        for (int i=0; i<tokens.length; i++) {
            if (tokens[i].equals(".")) {
                continue;
            } else if (tokens[i].equals("..")) {
                String path = System.getProperty("user.dir");
                path = path.substring(0, path.lastIndexOf("/"));
                System.setProperty("user.dir", path);
            } else {
                System.setProperty("user.dir", System.getProperty("user.dir") + "/" + tokens[i]);
            }
        }


        if (args.length == 0) {
            System.out.println("cd: missing argument");
            return 1;
        } else if (args.length > 1) {
            System.out.println("cd: too many arguments");
            return 1;
        }

        return 0;
    }

    private static int cmd_exit(String args[]) {
        System.exit(0);
        return 0;
    }

    private static int cmd_echo(String args[]) {
        for (int i=0; i<args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println();
        return 0;
    }

    private static int cmd_pwd(String args[]) {
        System.out.println(System.getProperty("user.dir"));
        return 0;
    }
}
