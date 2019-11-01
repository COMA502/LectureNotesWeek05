package edu.dmacc.dsmcode.coma510.exercises;

public class ArrayOfFood {
    public static void main(String[] args) {
//        String[] foods = new String[5];
//        foods[0] = "burger";
//        foods[1] = "fries";
//        foods[2] = "pop";
//        foods[3] = "shake";
//        foods[4] = "salad";
        String[] foods = {"burger", "fries", "pop", "shake", "salad"};

//        for (int i = 0; i < foods.length; i++) {
//            String food = foods[i];
//            System.out.println(food);
//        }
        for(String food : foods) {
            System.out.println(food);
        }
    }
}
