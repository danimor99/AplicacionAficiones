package com.danimor99.aficiones;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class ListaFavoritos {

    private SharedPreferences sharedPreferences;

    public ListaFavoritos(Context context) {
        sharedPreferences = context.getSharedPreferences("listafavoritos", Context.MODE_PRIVATE);
    }

    public void agregarFavorito(String item) {
        Set<String> favoritos = sharedPreferences.getStringSet("fav", new HashSet<String>());
        favoritos.add(item);
        sharedPreferences.edit().putStringSet("fav", favoritos).apply();
    }


    public Set<String> getFavoritos() {
        return sharedPreferences.getStringSet("fav", new HashSet<>());
    }
}

