package com.danimor99.aficiones.ui.frmanager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.danimor99.aficiones.fr.aficiones.JugarVideojuegos;
import com.danimor99.aficiones.fr.tiposvideojuegos.juegosfps.CallofDuty;


public class PaginadorFPS extends FragmentPagerAdapter {

    private final Context mContext;

    public PaginadorFPS(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CallofDuty();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}