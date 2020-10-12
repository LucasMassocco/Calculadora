package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }
    public void onClickButton1 (View v) {
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");

    }
    public void onClickButton2 (View v) {
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");

    }
    public void onClickButton3 (View v) {
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");

    }
    public void onClickButton4 (View v) {
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }
    public void onClickButton5 (View v) {
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }
    public void onClickButton6 (View v) {
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }
    public void onClickButton7 (View v) {
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }
    public void onClickButton8 (View v) {
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public void onClickAdicao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }
    public void onClickSub(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "-";
            atualizarDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }
    public void onClickMult(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "*";
            atualizarDisplay("*");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }
    public void onClickDiv(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacao = "/";
            atualizarDisplay("/");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um número antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickIgual (View v) {
        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()) {
            int numero1 = Integer.parseInt(primeiroNumero);
            int numero2 = Integer.parseInt(segundoNumero);
            if (operacao.equals("/")) {
                int resultado = numero1 / numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("*")) {
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("+")) {
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
        }else {
            Toast.makeText(MainActivity.this,"Nenhuma Operação Foi Solicitada", Toast.LENGTH_LONG).show();
        }

    }

    private void atualizarDisplay(String texto) {
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);


    }
    private void atualizarNumeroDigitado(String numero) {
        if (operacao.isEmpty()) {
            primeiroNumero = primeiroNumero + numero;
        }else {
            segundoNumero = segundoNumero + numero;
        }
    }









}