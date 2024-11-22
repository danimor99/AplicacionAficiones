package com.danimor99.aficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.danimor99.aficiones.R;
import com.danimor99.aficiones.fr.tiposvideojuegos.Accion;
import com.danimor99.aficiones.fr.tiposvideojuegos.FPS;


public class PaginadorTiposVideojuegos extends FragmentPagerAdapter {


    private final Context mContext;

    public PaginadorTiposVideojuegos(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @StringRes
    private static final int[] TITULOS = new int[]{
            R.string.tipojuegoaccion,
            R.string.tipojuegofps
    };

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Accion();
            case 1:
                return new FPS();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TITULOS[position]);
    }

}
