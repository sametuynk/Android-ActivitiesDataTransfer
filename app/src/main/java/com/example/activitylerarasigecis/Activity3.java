package com.example.activitylerarasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.activitylerarasigecis.databinding.Activity3Binding;

public class Activity3 extends AppCompatActivity {

    private Activity3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=Activity3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonGoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent=new Intent(Activity3.this,MainActivity.class);
                startActivity(yeniIntent);
            }
        });
    }
}