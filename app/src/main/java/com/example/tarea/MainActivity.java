package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.btn1);

        boton1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent Irapagina2 = new Intent(MainActivity.this, MainActivity2.class);
                                          startActivity(Irapagina2);

                                      }
                                  }
        );
    }
}