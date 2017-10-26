package com.acadgild.imdb.mainwork;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.acadgild.imdb.R;
import com.acadgild.imdb.fragment.MovieList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        MovieList movieListFragment = new MovieList();
        transaction.replace(R.id.fragmentContainer,movieListFragment);
        transaction.commit();
    }
}


