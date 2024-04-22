package kh.edu.rupp.lab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kh.edu.rupp.lab.databinding.ActivityEditProfileBinding;
import kh.edu.rupp.lab.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //back Activity

        binding.btnBack.setOnClickListener( v -> {
            finish();
        });

        //get Data

        Intent intent = getIntent();
        String fName = intent.getStringExtra("fName");
        String lName = intent.getStringExtra("lName");
        String bio = intent.getStringExtra("bio");
        binding.textFirstName.setText(fName);
        binding.textLastName.setText(lName);
        binding.textBio.setText(bio);


    }
}
