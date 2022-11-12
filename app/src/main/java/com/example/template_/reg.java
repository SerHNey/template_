package com.example.template_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }
    public void logIn(View view){
        Intent login = new Intent(reg.this,MainActivity.class);
        startActivity(login);
    }
    public void acceptcreateacc(View view){
        Intent accetpcreateacc = new Intent(reg.this,accetpcreateacc.class);
        startActivity(accetpcreateacc);
    }
}