package com.example.unitconvertor;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {
    Button length,temp,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        length=findViewById(R.id.length);
        temp=findViewById(R.id.temp);
        weight=findViewById(R.id.weight);
        length.setOnClickListener(view -> replaceFragment(new Length()));
        temp.setOnClickListener(view -> replaceFragment(new temp()));
        weight.setOnClickListener(view -> replaceFragment(new weight()));
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }
}
