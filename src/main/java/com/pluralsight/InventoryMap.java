package com.pluralsight;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InventoryMap {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("-----Search Inventory-----");
        System.out.print("what product would you want to search for: ");
        String userProduct = userInput.nextLine();

        HashMap<String,String> inventory = loadInventory();
        System.out.println(inventory.get(userProduct));


    }

    public static HashMap<String, String> loadInventory() {

        HashMap<String, String> fruits = new HashMap<>();

        fruits.put("mango", "1|mango|10.99");
        fruits.put("grapes", "2|grapes|0.99");
        fruits.put("pineapple", "3|pineapple|3.99");
        fruits.put("watermelon", "4|watermelon|5.99");
        fruits.put("strawberry", "5|strawberry|2.99");



        return fruits;
    }
}
