package com.example.grocerylist;

import java.util.ArrayList;

/**
 * Created by dlowrey on 10/23/2017.
 */

public class GroceryModel {

    // instance of our GroceryModel object
    private static GroceryModel instance;
    // mock database to hold grocery list items
    private ArrayList<String> groceryList = new ArrayList<String>();

    /* private constructor (so other classes can not create a new instance of GroceryModel */
    private GroceryModel() {}

    /*
    public method to get an instance of Grocery model.
    if one is already created, get that one, else, create a new one
     */
    public static synchronized GroceryModel getInstance() {
        if (instance == null) {  // check if GroceryModel has already been instantiated
            instance = new GroceryModel();  // instantiate new
        }
        return instance;  // return instance
    }

    /* method to add a grocery list item to the mock database */
    public void add(String item) {
        groceryList.add(item);
    }

    /* method to get all grocery list items from the mock database */
    public ArrayList<String> getAll() {
        return groceryList;
    }
}
