package com.java;
import java.util.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        
        
            for(int i=0; i <array.size();i++){
                
                int num = array.get(i);
                boolean greater = (num > 45);
                boolean divisible = (num % 4==0);
                if(greater && divisible){
                    array.set(i,-8);
                }
                else if(greater){
                array.set(i,-2);
                }
                else if(divisible){
                    array.set(i,-4);
                }
                
            }
        
        return array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);

        System.out.println("here");
        Scanner in = new Scanner(System.in);
       while (in.hasNextInt()) {
        	System.out.println("one element ");
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(num);
        }
        int new_length = processArray(arrayList);
        System.out.println(new_length);
        for (int i = 0; i < new_length; i++)
           
        	System.out.println(arrayList.get(i));
    }
}
