package com.example.android.aliexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ImageView check = (ImageView) findViewById(R.id.checkout);
// Set a click listener on that View
        check.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(PaymentActivity.this, FinalActivity.class);
                startActivity(paymentIntent);
            }
        });
        }
}
