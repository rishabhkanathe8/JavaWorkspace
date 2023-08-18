package com.wolterskluwer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        //uncomment this if you want to read input.
        //imports for BufferedReader
        //import java.io.BufferedReader;
        //import java.io.InputStreamReader;

        //import for Scanner and other utility classes
        //import java.util.*;

        // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

        // Sample code to perform I/O:
        // Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String name = br.readLine();                // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        //String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        // Write your code here

        // Scanner scanner = new Scanner(System.in);
        int testCases = s.nextInt(); // Number of test cases

        for (int i = 0; i < testCases; i++) {
            int k = s.nextInt(); // Kth value to determine

            int count = 0;
            int number = 1;
            while (count < k) {
                String binary = convertToBinaryString(number);
                if (!binary.contains("11")) {
                    count++;
                    if (count == k) {
                        System.out.println(binary);
                        break;
                    }
                }
                number++;
            }
        }
    }

    private static String convertToBinaryString(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
}
