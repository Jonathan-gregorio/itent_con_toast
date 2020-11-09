package com.example.tarea;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button boton2 =findViewById(R.id.btn2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ira1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(ira1);
            }
        });

    }
}