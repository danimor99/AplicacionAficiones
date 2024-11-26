package com.danimor99.aficiones.fr.tiposvideojuegos.juegosaccion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.danimor99.aficiones.R;
import com.danimor99.aficiones.databinding.ActivityAficionesBinding;
import com.danimor99.aficiones.databinding.FragmentWukongBinding;


public class Wukong extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wukong, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true); // Habilita el manejo de menús
    }
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_about_me, menu); // Reemplaza con el nombre de tu menú
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.favButton) {
            Toast toast = Toast.makeText(requireActivity(), "¡Cómo me gustan mis aficiones!", Toast.LENGTH_SHORT);
            toast.show();
            return true; // El evento fue manejado
        }

        if (id == R.id.aboutMeButton) {
            // Si deseas abrir una nueva actividad:
          //  Intent intent = new Intent(requireActivity(), SobreMi.class); // Asegúrate de que 'SobreMi' está en tu manifest
            //startActivity(intent);
            return true; // El evento fue manejado
        }

        if (id == R.id.myCodeButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/danimor99/"));
            startActivity(intent);
            return true; // El evento fue manejado
        }

        return super.onOptionsItemSelected(item); // Llamar al método base para manejar otros casos
    }



}