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

import com.danimor99.aficiones.databinding.ActivityTiposaccionBinding;
import com.danimor99.aficiones.fr.tiposvideojuegos.Accion;
import com.danimor99.aficiones.fr.tiposvideojuegos.FPS;
import com.danimor99.aficiones.ui.frmanager.Paginador;
import com.danimor99.aficiones.ui.frmanager.PaginadorAccion;
import com.google.android.material.tabs.TabLayout;


public class TiposAccion extends AppCompatActivity {


    private ActivityTiposaccionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTiposaccionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PaginadorAccion paginador = new PaginadorAccion(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabLayout = binding.tiposAccionTabs;
        tabLayout.setupWithViewPager(viewPager);

    }

}