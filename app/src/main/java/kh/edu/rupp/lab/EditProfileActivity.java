package kh.edu.rupp.lab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kh.edu.rupp.lab.databinding.ActivityEditProfileBinding;

public class EditProfileActivity extends AppCompatActivity {
    private ActivityEditProfileBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    binding = ActivityEditProfileBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

     //click on btn to show activity one more
        binding.btnSaveProfile.setOnClickListener(v ->{
            onClickEdit();
        });
}

  //create function
    private void onClickEdit() {

        //variable
        String fName = binding.fName.getText().toString();
        String lName = binding.lName.getText().toString();
        String bio = binding.bio.getText().toString();

      //use methode Intent to send Data
        Intent intent = new Intent(this, ProfileActivity.class);

        //Intent intent = new Intent(this,ProfileActivity.class);
        intent.putExtra("fName", fName);
        intent.putExtra("lName", lName);
        intent.putExtra("bio", bio);

        //send data
        startActivity(intent);
    }
}
