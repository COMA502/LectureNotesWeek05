package edu.dmacc.dsmcode.coma510.exercises;

import java.util.Scanner;

public class ArrayOfFoodAndPrices {

    /**
     * Example, given
     * Foods: “burger”, “fries”, “pop”, “shake”, “salad”
     * Prices: 2.00,       0.75,   1.00,   2.50,     3.00
     * Choice: “pop”
     * <p>
     * Output: $1.00
     */
    public static void main(String[] args) {
        String[] foods = {"burger", "fries", "pop", "shake", "salad"};
        double[] prices = {2.00, 0.75, 1.00, 2.50, 3.00};

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like? ");
        String order = input.next();

        for(int i = 0; i < foods.length; i++) {
            if(foods[i].equals(order)) {
                System.out.println(String.format("$%.2f", prices[i]));
            }
        }
    }
}
