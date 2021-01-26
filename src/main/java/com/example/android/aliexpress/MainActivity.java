package com.example.android.aliexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView category = (ImageView) findViewById(R.id.image);
// Set a click listener on that View
        category.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(categoryIntent);
            }
        });
        ImageView product = (ImageView) findViewById(R.id.imageView12);
// Set a click listener on that View
        product.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(MainActivity.this, ProductActivity.class);
                startActivity(categoryIntent);
            }
        });
        ImageView payment = (ImageView) findViewById(R.id.imageView9);
// Set a click listener on that View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

    }
}
