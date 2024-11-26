package com.danimor99.aficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.danimor99.aficiones.databinding.ActivityAficionesBinding;
import com.danimor99.aficiones.ui.frmanager.Paginador;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import com.danimor99.aficiones.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.favButton) {
            Toast toast = Toast.makeText(this, "¡Cómo me gustan mis aficiones!", Toast.LENGTH_SHORT);
            toast.show();
        }

        if (id == R.id.navigation_home) {
            Intent intent = new Intent(Login.this, Aficiones.class);
             startActivity(intent);
        }

        if (id == R.id.myCodeButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/danimor99/"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}