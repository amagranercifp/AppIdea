package com.example.appidea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etTituloGasto, etImporte;
    private Button btnAñadirGasto, btnVerGasto;

    private ArrayList<Integer> gastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTituloGasto = (EditText) findViewById(R.id.etTituloGasto);
        etImporte = (EditText) findViewById(R.id.etImporte);

        btnAñadirGasto = (Button) findViewById(R.id.btnAñadirGasto);
        btnVerGasto = (Button) findViewById(R.id.btnVerGasto);

        btnAñadirGasto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                etImporte.getText().toString();
            }
        });









    }
}