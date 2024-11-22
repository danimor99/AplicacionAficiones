package com.danimor99.aficiones.fr.aficiones;


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
import com.danimor99.aficiones.TiposVideojuegos;


public class JugarVideojuegos extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jugarvideojuegos, container, false);
        Button button = view.findViewById(R.id.buttonJugarVideojuegos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TiposVideojuegos.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

