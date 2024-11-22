package com.danimor99.aficiones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import com.danimor99.aficiones.databinding.ActivityTiposvideojuegosBinding;
import com.danimor99.aficiones.ui.frmanager.PaginadorTiposVideojuegos;
import com.google.android.material.tabs.TabLayout;



public class TiposVideojuegos extends AppCompatActivity {

    private ActivityTiposvideojuegosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTiposvideojuegosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorTiposVideojuegos paginador = new PaginadorTiposVideojuegos(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabLayout = binding.tiposVideojuegosTabs;
        tabLayout.setupWithViewPager(viewPager);
    }
}