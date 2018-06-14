package com.example.stud.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //fdsgdsgsiuhnvfsfidsugfnvdshffs

    RadioButton rbOpcja1;
    RadioButton rbOpcja2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbOpcja1 = findViewById(R.id.rbOpcja1);
        rbOpcja1 = findViewById(R.id.rbOpcja2);

        View.OnClickListener Listner = new View.OnClickListener(){

            @Override
            public void onClick (View view){
                RadioButton radio = (RadioButton)
                        String wartosc = "";

                RadioButton RADIO = (RadioButton) view;
                Toast.makeText(  MainActivity.this, text: "Kliknięto przycisk", radio.getText(), Toast.LENGTH_SHORT).show();
                if (view.getId() == R.id.rbOpcja1){}
                else if (view.getId() == R.id.rbOpcja2){}


            }

        };
        rbOpcja1.setOnClickListener(Listner);
        rbOpcja2.setOnClickListener(Listner);
    }
}
