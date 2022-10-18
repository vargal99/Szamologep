package com.vogella.android.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(final android.view.View v) {
        switch (v.getId()) {
            case R.id.osszead:
                Intent OSSZEAD_ACTIVITY = new Intent(MainActivity.this, OsszeadActivity.class);
                startActivity(OSSZEAD_ACTIVITY);
                break;

            case R.id.kivon:
                Intent KIVON_ACTIVITY = new Intent(MainActivity.this, KivonActivity.class);
                startActivity(KIVON_ACTIVITY);
                break;

            case R.id.szoroz:
                Intent SZOROZ_ACTIVITY = new Intent(MainActivity.this, SzorozActivity.class);
                startActivity(SZOROZ_ACTIVITY);
                break;


            case R.id.eloszt:
                Intent ELOSZT_ACTIVITY = new Intent(MainActivity.this, ElosztActivity.class);
                startActivity(ELOSZT_ACTIVITY);
                break;

        }

    }

    }