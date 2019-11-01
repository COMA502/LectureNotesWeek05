package edu.dmacc.dsmcode.coma510.examples;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        /**
         * Working with basic array syntax
         */
//        int[] ages = new int[3]; // Called "Initializing the array"
//        ages[0] = 20;//Called "Populating the array"
//        ages[1] = 30;
//        ages[2] = 40;
//        ages[3] = 40;//ArrayIndexOutOfBoundsException
        int[] ages = { 20, 30, 40 };
        System.out.println(Arrays.toString(ages));

        System.out.println("Size: " + ages.length);

        ages[1]--;
        System.out.println(Arrays.toString(ages));

        double averageAge = (double)(ages[0] + ages[1] + ages[2]) / ages.length;
        System.out.println("Average age: " + averageAge);

        /**
         * Looping through arrays
         */
        System.out.println("First age is: " + ages[0]);
//        for(int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }
        for(int age : ages) {
            if(age >= 21) {
                System.out.println(age);
            }
        }
    }
}
