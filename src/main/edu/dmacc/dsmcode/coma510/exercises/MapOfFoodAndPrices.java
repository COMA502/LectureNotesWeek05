package edu.dmacc.dsmcode.coma510.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapOfFoodAndPrices {

    /**
     * Refactor list example of foods/prices to use HashMap
     *
     * Example, given
     * Foods: “burger”, “fries”, “pop”, “shake”, “salad”
     * Prices: 2.00,       0.75,   1.00,   2.50,     3.00
     * Choice: “pop”
     * <p>
     * Output: $1.00
     */
    public static void main(String[] args) {
        HashMap<String, Double> menu = new HashMap<>();
        menu.put("burger", 2.00);
        menu.put("fries", 0.75);
        menu.put("pop", 1.00);
        menu.put("shake", 2.50);
        menu.put("salad", 3.00);

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like? ");
        String order = input.next();

        System.out.println(String.format("$%.2f", menu.get(order)));
    }
}
