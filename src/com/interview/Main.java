package com.interview;

import java.util.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            Integer num = array.get(i);
            if (num % 4 == 0&& num <47) {
                array.set(i, -6);
            } else if (num > 47 && num % 4 == 0) {
                array.set(i, -7);
            } else if (num > 47) {
                array.set(i, -3);
            }
        }
        return array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(num);
        }
        int new_length = processArray(arrayList);
        for (int i = 0; i < new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
