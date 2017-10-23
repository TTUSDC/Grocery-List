package com.example.grocerylist.AddItem;

import android.content.Context;

import com.example.grocerylist.GroceryModel;

/**
 * Created by dlowrey on 10/23/2017.
 */

public class AddItemPresenter implements AddItemInterface.Presenter{

    private GroceryModel groceryModel;
    private Context appContext;
    private AddItemInterface.View addItemView;

    public AddItemPresenter(Context context, AddItemInterface.View view) {
        // Get an instance of our mock database
        groceryModel = GroceryModel.getInstance();
        // Get a AddItemInterface.View connection so we can call those functions
        addItemView = view;
    }


    @Override
    public void addItem(String item) {
        // Add the item to our mock database
        groceryModel.add(item);
        // Exit the activity
        addItemView.exit();
    }
}
