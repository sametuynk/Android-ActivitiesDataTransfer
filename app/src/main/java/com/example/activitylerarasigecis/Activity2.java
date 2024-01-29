package com.example.activitylerarasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.activitylerarasigecis.databinding.Activity2Binding;
import com.example.activitylerarasigecis.databinding.ActivityMainBinding;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttongoto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent2=new Intent(Activity2.this,Activity3.class);
                startActivity(yeniIntent2);
            }
        });

    }
}