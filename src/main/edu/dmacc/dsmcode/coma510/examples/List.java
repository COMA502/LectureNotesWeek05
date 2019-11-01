package edu.dmacc.dsmcode.coma510.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List {

    public static void main(String[] args) {
        /**
         * Basics of working with lists
         */
//        Collection<String> names = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Greg");
        names.add("Greg");
        names.add("Eric");

        System.out.println(names);
        System.out.println("First name is " + names.get(0));
        System.out.println("Last name is " + names.get(names.size() - 1));

        System.out.println("First Index of Greg is " + names.indexOf("Greg"));
        System.out.println("Last Index of Greg is " + names.lastIndexOf("Greg"));
        System.out.println("Does names contain Greg? " + names.contains("Greg"));

        names.remove("Greg");
        System.out.println(names);
        System.out.println("Is names empty? " + names.isEmpty());

        /**
         * Looping lists
         */
//        for(int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        for(String name : names) {
//            System.out.println(name);
//        }

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.equals("Greg")) {
                iterator.remove();
            }
//            System.out.println(name);
        }
        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("a");
        names2.add("a");
        names2.add("a");
        names2.add("a");
        names2.add("a");
        names2.add("a");
        names2.add("a");
        names2.add("a");
        for(String str : names2) {
            names2.remove(0);
        }
        System.out.println(names2);
    }
}
