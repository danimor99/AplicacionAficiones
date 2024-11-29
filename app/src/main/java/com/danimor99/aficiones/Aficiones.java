package com.danimor99.aficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.danimor99.aficiones.databinding.ActivityAficionesBinding;
import com.danimor99.aficiones.ui.frmanager.Paginador;
import com.danimor99.aficiones.ui.frmanager.PaginadorTiposVideojuegos;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador paginador = new Paginador(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.favButton) {
            Intent intent = new Intent(Aficiones.this, Favoritos.class);
            startActivity(intent);
        }

        if (id == R.id.aboutMeButton) {
            //Intent intent = new Intent(Aficiones.this, SobreMi.class);
           // startActivity(intent);
        }

        if (id == R.id.myCodeButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/danimor99/"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
