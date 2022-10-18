package com.vogella.android.szamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OsszeadActivity extends AppCompatActivity implements View.OnClickListener {


        Button osszeadas;
        EditText osszeadando, osszeado;
        TextView osszeadaseredmeny;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_osszead);

            osszeadas = (Button) findViewById(R.id.btnOsszead);
            osszeadando = (EditText) findViewById(R.id.etOsszando);
            osszeado = (EditText) findViewById(R.id.etOsszeado);
            osszeadaseredmeny = (TextView) findViewById(R.id.oszadEredmeny);

            osszeadas.setOnClickListener(this);

            Button osszeadas = (Button) findViewById(R.id.btnOsszead);
            osszeadas.setOnClickListener(this);
        }

        public void onClick(View v) {
            if (!osszeadando.getText().toString().equals("") && !osszeado.getText().toString().equals("")) {
                switch (v.getId()) {
                    case R.id.btnOsszead:
                        double osszead1 = Integer.parseInt(osszeadando.getText().toString());
                        double osszead2 = Integer.parseInt(osszeado.getText().toString());
                        double eredmeny = osszead1 + osszead2;

                        osszeadaseredmeny.setText(Double.toString(eredmeny));
                        break;
                }
            }else{
                Toast.makeText(this, "Üres mező", Toast.LENGTH_LONG).show();
            }
        }
    }