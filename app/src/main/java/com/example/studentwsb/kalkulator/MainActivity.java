package com.example.studentwsb.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.studentwsb.kalkulator.R;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,
            button8,button9,button10,buttonKropka,buttonC,buttonPlus,
            buttonMinus,buttonRazy,buttonPodziel,buttonWynik;


    EditText editText = findViewById(R.id.editText);

    float zmienna1, zmienna2;

    boolean Dodawanie, Odejmowanie, Mnozenie, Dzielenie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonKropka = (Button) findViewById(R.id.buttonKropka);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonRazy = (Button) findViewById(R.id.buttonRazy);
        buttonPodziel = (Button) findViewById(R.id.buttonPodziel);
        buttonWynik = (Button) findViewById(R.id.buttonWynik);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + "0");
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    zmienna1 = Float.parseFloat(editText.getText() + "");
                    Dodawanie = true;
                    editText.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zmienna1 = Float.parseFloat(editText.getText() + "");
                Odejmowanie = true;
                editText.setText(null);
            }
        });

        buttonRazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zmienna1 = Float.parseFloat(editText.getText() + "");
                Mnozenie = true;
                editText.setText(null);
            }
        });

        buttonPodziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zmienna1 = Float.parseFloat(editText.getText() + "");
                Dzielenie = true;
                editText.setText(null);
            }
        });

        buttonWynik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zmienna2 = Float.parseFloat(editText.getText() + "");

                if (Dodawanie == true) {
                    editText.setText(zmienna1 + zmienna2 + "");
                    Dodawanie = false;
                }

                if (Odejmowanie == true) {
                    editText.setText(zmienna1 - zmienna2 + "");
                    Odejmowanie = false;
                }

                if (Mnozenie == true) {
                    editText.setText(zmienna1 * zmienna2 + "");
                    Mnozenie = false;
                }

                if (Dzielenie == true) {
                    editText.setText(zmienna1 / zmienna2 + "");
                    Dzielenie = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText() + ".");
            }
        });



    }
}
