package com.example.grocerylist.AddItem;

import android.content.Context;

import com.example.grocerylist.GroceryModel;

/**
 * Created by dlowrey on 10/23/2017.
 */

public class AddItemPresenter implements AddItemInterface.Presenter{

    private GroceryModel groceryModel;

    public AddItemPresenter() {
        // Get an instance of our mock database
        groceryModel = GroceryModel.getInstance();
    }


    @Override
    public void addItem(String item) {
        // Add the item to our mock database
        groceryModel.add(item);
    }
}
