package com.casetrue.array_list_2d_20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * 2D ArrayList = a dynamci list of lists
         * can change  the size  of these lists during runtime
         */

         ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

         ArrayList<String> bakeryList = new ArrayList<>();
         bakeryList.add("past");
         bakeryList.add("garlic bread");
         bakeryList.add("donuts");

         ArrayList<String> produceList = new ArrayList<>();
         produceList.add("tomatos");
         produceList.add("zucchini");
         produceList.add("pepers");

         ArrayList<String> drinkList = new ArrayList<>();
         drinkList.add("soda");
         drinkList.add("thee");
         drinkList.add("coffee");

         groceryList.add(bakeryList);
         groceryList.add(produceList);
         groceryList.add(drinkList);


         System.out.println(groceryList.get(1).get(2));
    }
}
