package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class SIM {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String nextSearch;
        do {
            System.out.println("-----Search Inventory-----");
            System.out.print("what product would you want to search for: ");
            String userProduct = userInput.nextLine();

            HashMap<String, String> inventory = loadInventory();
            System.out.println(inventory.get(userProduct));
            System.out.print("what to look up more: ");
            nextSearch = userInput.nextLine();

        } while (nextSearch.equalsIgnoreCase("yes"));
        System.out.println("Good Bye");
        userInput.close();


    }

    public static HashMap<String, String> loadInventory() {

        HashMap<String, String> fruits = new HashMap<>();

        fruits.put("mango", "001|mango|10.99");
        fruits.put("grapes", "002|grapes|0.99");
        fruits.put("pineapple", "003|pineapple|3.99");
        fruits.put("watermelon", "004|watermelon|5.99");
        fruits.put("strawberry", "005|strawberry|2.99");


        return fruits;
    }

}

