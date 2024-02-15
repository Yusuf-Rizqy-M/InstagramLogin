package com.example.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class KalkulActivity extends AppCompatActivity {
    //list widget
    EditText txtangka1;
    EditText txtangka2;
    Spinner spinner1;
    TextView tvhasil;

    Button btnhitung;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkul);

        txtangka1 = findViewById(R.id.txtangka1);
        txtangka2 = findViewById(R.id.txtangka2);
        tvhasil = findViewById(R.id.tvhasil);
        spinner1 = findViewById(R.id.spinner1);
        btnhitung = findViewById(R.id.btnhitung);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int angka1 = Integer.parseInt(txtangka1.getText().toString());
                int angka2 = Integer.parseInt(txtangka2.getText().toString());
                int hasil = 0;
                String text = spinner1.getSelectedItem().toString();

                switch (text){
                    case "Tambah":
                        hasil = angka1 + angka2;
                        tvhasil.setText(hasil+"");
                        break;

                    case "Kurang":
                        hasil = angka1 - angka2;
                        tvhasil.setText(hasil+"");
                        break;

                    case "Kali":
                        hasil = angka1 * angka2;
                        tvhasil.setText(hasil+"");
                        break;
                    case "Bagi":
                        double angka1double = Double.parseDouble(txtangka1.getText().toString());
                        double angka2double = Double.parseDouble(txtangka2.getText().toString());
                        double hasilDouble = angka1double/angka2double;
                        tvhasil.setText(hasilDouble+"");
                        break;
                }
            }
        });
    }
}