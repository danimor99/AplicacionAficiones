package com.danimor99.aficiones;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

public class Favoritos extends AppCompatActivity {

        private TextView textoFavoritos;
        private ListaFavoritos listaFavoritos;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_favoritos);

            // Inicializamos el FavoriteManager
            listaFavoritos = new ListaFavoritos(this);

            // Recuperamos los favoritos
            Set<String> favorito = listaFavoritos.getFavoritos();

            // Mostramos los favoritos

            textoFavoritos.setText("Favorites:\n" + TextUtils.join("\n", favorito));
        }
    }

