package com.example.madfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class activity_add_items extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText food_name, food_price;
    Button addbtn;
    Spinner aSpinner;

    DatabaseReference reff;
    foods foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);

        Spinner aSpinner = findViewById(R.id.aSpinner);
        aSpinner.setOnItemSelectedListener(this);


        food_name = (EditText) findViewById(R.id.food_name);
        food_price = (EditText) findViewById(R.id.food_price);
        addbtn = (Button) findViewById(R.id.addbtn);
        foods = new foods();
        reff = FirebaseDatabase.getInstance().getReference().child("mad-food-delivery-app").push();

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float price = Float.parseFloat(food_price.getText().toString().trim());

                foods.setFood_name(food_name.getText().toString().trim());
                foods.setFood_price(price);

                Toast.makeText(activity_add_items.this,"data inserted succesfully", Toast.LENGTH_SHORT ).show();
            }
        });
    }

   @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapterView.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {




    }
}