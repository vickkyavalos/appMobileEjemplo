package com.example.appspruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText IngresoEmail,contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IngresoEmail=findViewById(R.id.IngresoEmail);
        contraseña=findViewById(R.id.contraseña);
    }
    public void  home(View view){
        Intent intento=new Intent(this, MainActivity2.class);
        startActivity(intento);
    }
}