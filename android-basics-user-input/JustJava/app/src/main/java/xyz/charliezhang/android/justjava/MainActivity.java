package xyz.charliezhang.android.justjava;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/*
 * Displays an order form to order coffee
 */
public class MainActivity extends AppCompatActivity {

    private int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantity = 0;
    }

    /*
     * Called when order button is clicked
     */
    public void submitOrder(View view) {
        String message = "Total: $" + quantity * 5 + "\nThank you!";
        displayMessage(message);
    }

    /*
     * Increments quantity
     */
    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    /*
     * Decrements quantity
     */
    public void decrement(View view) {
        if(quantity > 0) {
            quantity--;
            display(quantity);
        }
    }

    /**
     * Displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(message);
    }

    /**
     * Displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /*
     * Displays the given quantity value on the screen
     */
    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }
}
