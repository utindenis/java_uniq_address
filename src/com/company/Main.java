package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    /**
     * Get count of unique addresses in file, on unix systems.
     *
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        messageOfCount();
        new ProcessBuilder(argumentsForProcessBuilder()).inheritIO().start().waitFor();
    }

    /**
     * Executes the file with sh (Bourne shell).
     * -u  delete duplicate entries in sorting results
     * Result is redirected to the wc utility, which simply counts the number of lines.
     */
    private static ArrayList<String> argumentsForProcessBuilder() {
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add("/bin/sh");
        arguments.add("-c");
        arguments.add("sort -u data.txt | wc -l");
        return arguments;
    }

    private static void messageOfCount() {
        System.out.println("Count of unique addresses in file: ");
    }
}
