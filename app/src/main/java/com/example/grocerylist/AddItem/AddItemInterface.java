package com.example.grocerylist.AddItem;

/**
 * Created by dlowrey on 10/23/2017.
 */

public interface AddItemInterface {

    interface View {
    }

    interface Presenter {
        void addItem(String item);
    }
}
