package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        /*String nombre=Intent.getStringExtra(MainActivity.extra);

        if (nombre!=null)
            textView.setText("Hola: "+nombre;*/
        Bundle bundle=intent.getExtras();
        String nombre=bundle.getString(MainActivity.extra,"");
        textView.setText("Hola "+nombre);
    }
}
