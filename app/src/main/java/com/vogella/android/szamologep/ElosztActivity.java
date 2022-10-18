package com.vogella.android.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ElosztActivity extends AppCompatActivity implements View.OnClickListener {

    Button osztas;
    EditText osztando, oszto;
    TextView osztaseredmeny;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eloszt);


        osztas = (Button) findViewById(R.id.btnosztas);
        osztando = (EditText) findViewById(R.id.etOsztando);
        oszto = (EditText) findViewById((R.id.etOszto));
        osztaseredmeny = (TextView) findViewById((R.id.osztaseredmeny));

        osztas.setOnClickListener(this);

        Button osztas = (Button) findViewById(R.id.btnosztas);
        osztas.setOnClickListener(this);


    }

    public void onClick(View v) {
        if (!osztando.getText().toString().equals("") && !oszto.getText().toString().equals("")) {
            switch (v.getId()) {
                case R.id.btnosztas:
                    int oszt1 = Integer.parseInt(osztando.getText().toString());
                    int oszt2 = Integer.parseInt(oszto.getText().toString());
                    int eredmeny = oszt1 / oszt2;

                    osztaseredmeny.setText(Double.toString(eredmeny));
                    break;

            }
        } else {
            Toast.makeText(this, "Üres mező", Toast.LENGTH_LONG).show();
        }
    }
}