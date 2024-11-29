package com.danimor99.aficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.Toast;

import com.danimor99.aficiones.databinding.ActivityAficionesBinding;
import com.danimor99.aficiones.ui.frmanager.Paginador;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
            String usuario = binding.usuarioLogin.getText().toString().trim();
            String contraseña = binding.contrasenaLogin.getText().toString().trim();


                if (usuario.equals("root") && contraseña.equals("12345")) {

                    Toast.makeText(getApplicationContext(), "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, Aficiones.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(getApplicationContext(), "Credenciales incorrectas. Prueba root 12345", Toast.LENGTH_SHORT).show();
                }

    }
    });
}

}