package com.danimor99.aficiones.fr.tiposvideojuegos;



import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.danimor99.aficiones.R;
import com.danimor99.aficiones.TiposAccion;
import com.danimor99.aficiones.TiposFPS;

public class Accion extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_juegoaccion, container, false);

        Button button = view.findViewById(R.id.buttonJuegoaccion);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TiposAccion.class);
                startActivity(intent);
            }
        });

        return view;
    }
}