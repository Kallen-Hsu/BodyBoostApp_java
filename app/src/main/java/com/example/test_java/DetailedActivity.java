package com.example.test_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.test_java.databinding.ActivityDetailedBinding;
import com.example.test_java.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {
    ActivityDetailedBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            String calories = intent.getStringExtra("calories");
            int ingredients = intent.getIntExtra("ingredients", R.string.maggiIngredients);
            int image = intent.getIntExtra("image", R.drawable.tea_cup);
            binding.detailName.setText(name);
            binding.detailTime.setText(calories);
            binding.detailIngredients.setText(ingredients);
            binding.detailImage.setImageResource(image);
        }
    }
}