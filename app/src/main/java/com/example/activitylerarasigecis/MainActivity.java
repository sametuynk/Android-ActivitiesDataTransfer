package com.example.activitylerarasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.activitylerarasigecis.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonGoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent=new Intent(MainActivity.this,Activity2.class);
                startActivity(yeniIntent);
            }
        });
        binding.buttonGotoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Kisiler kisi=new Kisiler(999,"Samet",1.73);

                Intent yeniIntent=new Intent(MainActivity.this,ActivityB.class);
                yeniIntent.putExtra("Mesaj","Merhaba");
                yeniIntent.putExtra("Yaş",26);
                yeniIntent.putExtra("Boy",1.78);

                yeniIntent.putExtra("nesne",kisi);
                startActivity(yeniIntent);

            }
        });
    }
}