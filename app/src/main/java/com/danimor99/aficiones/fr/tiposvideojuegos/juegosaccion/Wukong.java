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
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.danimor99.aficiones.ListaFavoritos;
import com.danimor99.aficiones.R;
import com.danimor99.aficiones.TiposVideojuegos;
import com.danimor99.aficiones.databinding.ActivityAficionesBinding;
import com.danimor99.aficiones.databinding.FragmentWukongBinding;


public class Wukong extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wukong, container, false);
        Button button = view.findViewById(R.id.btnWukong);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.heishenhua.com"));
                startActivity(intent);
            }
        });
        
        return view;

    }

}