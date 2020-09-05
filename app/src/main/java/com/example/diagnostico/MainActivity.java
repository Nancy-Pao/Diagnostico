package com.example.diagnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView img; //Se declara la variable img
    private static Button boton; //Se declara la variable boton

    private int cambiar;
    int [] imagenes = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
        public void buttonclick()
    {
            img =(ImageView) findViewById(R.id.imageView);
            boton = (Button) findViewById(R.id.button);
            boton.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View view) {
                            cambiar++;
                            cambiar= cambiar % imagenes.length;
                            img.setImageResource(imagenes[cambiar]);
                        }
                    }
            );
        }
    }
