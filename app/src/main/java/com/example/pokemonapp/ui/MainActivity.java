package com.example.pokemonapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.pokemonapp.R;
import com.example.pokemonapp.databinding.ActivityMainBinding;
import com.example.pokemonapp.ui.fragments.Favorites;
import com.example.pokemonapp.ui.fragments.Home;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private boolean isFavoriteListVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Home()).commit();

        binding.changeFragment.setOnClickListener(v -> {
            if(isFavoriteListVisible){
                isFavoriteListVisible = false;
                binding.changeFragment.setText("Favorites");
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Home()).commit();

            }else{
                isFavoriteListVisible = true;
                binding.changeFragment.setText("Home");
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Favorites()).commit();
            }
        });
    }
}