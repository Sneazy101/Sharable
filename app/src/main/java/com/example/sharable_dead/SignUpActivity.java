package com.example.sharable_dead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sharable_dead.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();
    }
}