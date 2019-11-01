package edu.dmacc.dsmcode.coma510.examples;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Greg");
        uniqueNames.add("Greg");
        uniqueNames.add("Dan");
        System.out.println(uniqueNames);

        uniqueNames.remove("Greg");
//        uniqueNames.get(0);//Doesn't exist on a set, have to loop instead
        for(String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
