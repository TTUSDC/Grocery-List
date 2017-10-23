package com.example.grocerylist;

import java.util.ArrayList;

/**
 * Created by dlowrey on 10/23/2017.
 */

public class GroceryModel {

    private static GroceryModel instance;
    private ArrayList<String> groceryList = new ArrayList<String>();

    private GroceryModel() {

    }

    public static synchronized GroceryModel getInstance() {
        if (instance == null) {
            instance = new GroceryModel();
        }
        return instance;
    }

    public void add(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getAll() {
        return groceryList;
    }
}
