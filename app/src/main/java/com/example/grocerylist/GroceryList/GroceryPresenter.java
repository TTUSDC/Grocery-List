package com.example.grocerylist.GroceryList;

import android.content.Context;
import android.content.Intent;

import com.example.grocerylist.AddItem.AddItemActivity;
import com.example.grocerylist.GroceryModel;

import java.util.ArrayList;

/**
 * Created by dlowrey on 10/23/2017.
 */

public class GroceryPresenter implements GroceryInterface.Presenter {

    private Context appContext;
    private GroceryModel groceryModel;
    private GroceryInterface.View groceryView;

    public GroceryPresenter(Context context, GroceryInterface.View view) {
        // Get an instance of our mock database
        groceryModel = GroceryModel.getInstance();
        // Get a GroceryInterface.View connection so we can call those functions
        groceryView = view;
        // Get the application context
        appContext = context;
    }

    @Override
    public void updateGroceryList() {
        // Get all of the grocery items in our mock database
        ArrayList<String> groceries = groceryModel.getAll();
        // Pass them to the view to display
        groceryView.showGroceryList(groceries);
    }

    @Override
    public void startAddItemActivity() {
        // Start a new activity to add an item to the list
        Intent addItemIntent = new Intent(appContext, AddItemActivity.class);
        appContext.startActivity(addItemIntent);


    }
}
