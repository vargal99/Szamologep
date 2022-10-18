package com.vogella.android.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KivonActivity extends AppCompatActivity implements View.OnClickListener {

    Button kivonas;
    EditText kivonando, kivono;
    TextView kivonaseredmeny;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kivon);

        kivonas = (Button) findViewById(R.id.btkivon);
        kivonando = (EditText) findViewById(R.id.etKisebb);
        kivono = (EditText) findViewById(R.id.etKivonand);
        kivonaseredmeny = (TextView) findViewById(R.id.kivoneredmeny);

        kivonas.setOnClickListener(this);

        Button kivonas = (Button) findViewById(R.id.btkivon);
        kivonas.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (!kivonando.getText().toString().equals("") && !kivono.getText().toString().equals("")) {
            switch (v.getId()) {
                case R.id.btkivon:
                    int kivon1 = Integer.parseInt(kivonando.getText().toString());
                    int kivon2 = Integer.parseInt(kivono.getText().toString());
                    int eredmeny = kivon1 - kivon2;

                    kivonaseredmeny.setText(Double.toString(eredmeny));
                    break;
            }
        } else {
            Toast.makeText(this, "Üres mező", Toast.LENGTH_LONG).show();
        }
    }
}