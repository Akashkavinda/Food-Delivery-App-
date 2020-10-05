package com.example.madfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_edit_item2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item2);

        food name
        food price
        food type
        upload photo


        String name, price, type, photo;
        EditText na,pr,ty,ph;
        Button add;
        DatabaseReference reff;
        Add add;

        protected void onCreate(Bundle savedInstanceState) {
            na =(EditText) findViewById(R.id.na);
            pr =(EditText) findViewById(R.id.price);
            ty =(EditText) findViewById(R.id.type);
            ph =(EditText) findViewById(R.id.photo);

            add =(Button) findViewById(R.id.photo);
            reff = FirebaseDatabase.getInstance().getReference.child("datapushing").push();

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Float pyr = Float.parseFloat(pr.getText().toString().trim());

                    add.setName(na.getText().toStrings().trim());
                    add.setPrice(pyr);
                    add.setType(ty.getText().toStrings().trim());
                    add.setPhoto(ph.getText().toStrings().trim());
                }
            });

        }
    }

}