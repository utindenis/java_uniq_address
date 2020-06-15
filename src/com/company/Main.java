package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;

public class Main {

    /**
     * Get count of unique addresses in file.
     *
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("data.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        List<String> myList = new ArrayList<>();
        for (String x : lines) {
            if (!myList.contains(x))
                myList.add(x);
        }
        System.out.println("Array - " + lines);
        System.out.println("Count of unique elements - " + myList.size());
    }
}