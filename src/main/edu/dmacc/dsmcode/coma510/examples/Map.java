package edu.dmacc.dsmcode.coma510.examples;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Double> menu = new HashMap<>();
        menu.put("burger", 2.00);
        menu.put("fries", 0.75);
        menu.put("drink", 1.00);
        menu.put("drink", 1.50);
        System.out.println(menu);
        System.out.println(menu.get("drink"));

        if(menu.containsKey("shake")) {
            System.out.println(menu.get("shake"));
        } else {
            System.out.println("We don't have a shake!");
        }

        menu.remove("drink");
        System.out.println(menu);
        System.out.println(menu.keySet());
    }
}
