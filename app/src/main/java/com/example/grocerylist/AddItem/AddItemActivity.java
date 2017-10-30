package com.example.grocerylist.AddItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.grocerylist.GroceryModel;
import com.example.grocerylist.R;

public class AddItemActivity extends AppCompatActivity implements AddItemInterface.View{

    private EditText newItemEditText;
    private AddItemPresenter  presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        newItemEditText = (EditText) findViewById(R.id.newItemEditText);
        presenter = new AddItemPresenter();
    }

    /* OnClick() for when the user clicks Add button */
    public void addItem(View view) {
        // Get the text as string
        String item = newItemEditText.getText().toString();
        // Tell presenter to add the item
        presenter.addItem(item);
        this.finish();
    }
}
