package com.example.android.aliexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        ImageView home = (ImageView) findViewById(R.id.finaal);
// Set a click listener on that View
       home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(FinalActivity.this, MainActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
