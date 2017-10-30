package com.example.grocerylist.GroceryList;

import java.util.ArrayList;

/**
 * Created by dlowrey on 10/23/2017.
 */

public interface GroceryListInterface {

    interface View {
        void showGroceryList(ArrayList<String> groceryList);
    }


    interface Presenter {
        void updateGroceryList();
        void startAddItemActivity();
    }
}
