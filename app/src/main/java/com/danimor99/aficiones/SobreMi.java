package com.danimor99.aficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.danimor99.aficiones.databinding.ActivitySobremiBinding;

public class SobreMi extends AppCompatActivity {

    private ActivitySobremiBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstance) {
        super.onCreate(savedInstance);

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
            Toast toast = Toast.makeText(this, "¡Cómo me gustan mis aficiones!", Toast.LENGTH_SHORT);
            toast.show();
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
