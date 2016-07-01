package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(quantity);
        displayPrice(quantity * 5);
    }

    public void increment(View view) {
        quantity += 1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity -= 1;
        display(quantity);
    }

    /**
     * Displays the quantity to the screen
     * @param number holds the quantity that will be displayed
     */
    private void display(int number) {
        TextView view = (TextView) findViewById(R.id.quantity_text_view);
        view.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
