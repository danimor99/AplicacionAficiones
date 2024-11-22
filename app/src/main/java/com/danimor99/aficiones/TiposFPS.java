package com.danimor99.aficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.danimor99.aficiones.databinding.ActivityTiposfpsBinding;
import com.danimor99.aficiones.fr.tiposvideojuegos.FPS;
import com.danimor99.aficiones.ui.frmanager.Paginador;
import com.danimor99.aficiones.ui.frmanager.PaginadorFPS;
import com.google.android.material.tabs.TabLayout;


public class TiposFPS extends AppCompatActivity {

    private ActivityTiposfpsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTiposfpsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorFPS paginador = new PaginadorFPS(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabLayout = binding.tiposFpsTabs;
        tabLayout.setupWithViewPager(viewPager);
    }

}