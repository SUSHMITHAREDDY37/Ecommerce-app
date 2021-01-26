package com.example.android.aliexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ImageView product = (ImageView) findViewById(R.id.imageVieww);
// Set a click listener on that View
        product.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(CategoryActivity.this, ProductActivity.class);
                startActivity(categoryIntent);
            }
        });
    }
}
