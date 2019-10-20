package com.example.haruskuat.mybooks;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {
    int indi;

    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        indi = tabCount;


    }
    @Override
    public android.support.v4.app.Fragment getItem(int position){
        switch(position){
            case 0:
                return new Mik1();
            case 1:
                return new Mik2();
            case 2:
                return new Mik3();
            case 3:
                return new Mik4();
            case 4:
                return new Mik5();
            default:
                return null;
        }
    }
    @Override
    public int getCount(){
        return indi;
    }
}
