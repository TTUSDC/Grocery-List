package com.example.grocerylist.GroceryList;

import java.util.ArrayList;

/**
 * Created by dlowrey on 10/23/2017.
 */

public interface GroceryListInterface {

    interface View {
        // the view's method that shows a grocery list
        void showGroceryList(ArrayList<String> groceryList);
    }


    interface Presenter {
        // the presenter's method that update's the view's on-screen list
        void updateGroceryList();
        // the presenter's method that starts the AddItemActivity
        void startAddItemActivity();
    }
}