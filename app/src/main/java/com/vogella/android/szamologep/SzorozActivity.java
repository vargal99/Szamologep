package com.vogella.android.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SzorozActivity extends AppCompatActivity implements View.OnClickListener {

    Button szorzas;
    EditText szozando, szorzo;
    TextView szorzaseredmeny;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szoroz);

        szorzas = (Button) findViewById(R.id.btnSzorzas);
        szozando = (EditText) findViewById(R.id.etSzorzando);
        szorzo = (EditText) findViewById(R.id.etSzorzo);
        szorzaseredmeny = (TextView) findViewById(R.id.szozasEredmeny);

        szorzas.setOnClickListener(this);

        Button osztas = (Button) findViewById(R.id.btnSzorzas);
        osztas.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (!szozando.getText().toString().equals("") && !szorzo.getText().toString().equals("")) {
            switch (v.getId()) {
                case R.id.btnSzorzas:
                    int szoroz1 = Integer.parseInt(szozando.getText().toString());
                    int szoroz2 = Integer.parseInt(szorzo.getText().toString());
                    int eredmeny = szoroz1 * szoroz2;

                    szorzaseredmeny.setText(Double.toString(eredmeny));
                    break;
            }
        } else {
            Toast.makeText(this, "Üres mező", Toast.LENGTH_LONG).show();

        }
    }
}