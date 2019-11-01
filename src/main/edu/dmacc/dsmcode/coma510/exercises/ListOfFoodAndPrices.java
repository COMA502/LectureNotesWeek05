package edu.dmacc.dsmcode.coma510.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListOfFoodAndPrices {

    /**
     * Refactor array example of foods/prices to use ArrayLists
     *
     * Example, given
     * Foods: “burger”, “fries”, “pop”, “shake”, “salad”
     * Prices: 2.00,       0.75,   1.00,   2.50,     3.00
     * Choice: “pop”
     * <p>
     * Output: $1.00
     */
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        foods.add("burger");
        foods.add("fries");
        foods.add("pop");
        foods.add("shake");
        foods.add("salad");
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(2.00);
        prices.add(0.75);
        prices.add(1.00);
        prices.add(2.50);
        prices.add(3.00);

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like? ");
        String order = input.next();

        for(int i = 0; i < foods.size(); i++) {
            if(foods.get(i).equals(order)) {
                System.out.println(String.format("$%.2f", prices.get(i)));
            }
        }
    }
}
