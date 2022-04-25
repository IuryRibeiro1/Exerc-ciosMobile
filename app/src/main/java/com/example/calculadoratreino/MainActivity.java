package com.example.calculadoratreino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis, numeroSete, numeroOito, numeroNove, ponto, adicao, subtracao, multiplicacao, divisao, igual, bt_limpar;

    private TextView txtExpressao, txtResultado;
    private ImageView backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();

        numeroZero.setOnClickListener(this);
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        adicao.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        divisao.setOnClickListener(this);











    }

    private void IniciarComponentes() {

        numeroZero = findViewById(R.id.numero_zero);
        numeroUm = findViewById(R.id.numero_um);
        numeroDois = findViewById(R.id.numero_dois);
        numeroTres = findViewById(R.id.numero_tres);
        numeroQuatro = findViewById(R.id.numero_quatro);
        numeroCinco = findViewById(R.id.numero_cinco);
        numeroSeis = findViewById(R.id.numero_seis);
        numeroSete = findViewById(R.id.numero_sete);
        numeroOito = findViewById(R.id.numero_oito);
        numeroNove = findViewById(R.id.numero_nove);
        ponto = findViewById(R.id.ponto);
        subtracao = findViewById(R.id.subtracao);
        adicao = findViewById(R.id.adicao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.divisao);
        igual = findViewById(R.id.igual);
        bt_limpar = findViewById(R.id.bt_limpar);
        txtExpressao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
        backspace = findViewById(R.id.backspace);

    }

    public void AcrescentarUmaExpressao(String string, boolean limpar_dados) {

        if (txtResultado.getText().equals("")) {
            txtExpressao.setText("");
        }
        if (limpar_dados) {
            txtResultado.setText("");
            txtExpressao.append(string);
        } else {
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText("");

        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_zero:
                AcrescentarUmaExpressao("0",true);
                break;

            case R.id.numero_um:
                AcrescentarUmaExpressao("1",true);
                break;

                case R.id.numero_dois:
                AcrescentarUmaExpressao("2",true);
                break;

            case R.id.numero_tres:
                AcrescentarUmaExpressao("3",true);
                break;

            case R.id.numero_quatro:
                AcrescentarUmaExpressao("4",true);
                break;

            case R.id.numero_cinco:
                AcrescentarUmaExpressao("5",true);
                break;

            case R.id.numero_seis:
                AcrescentarUmaExpressao("6",true);
                break;

            case R.id.numero_sete:
                AcrescentarUmaExpressao("7",true);
                break;

            case R.id.numero_oito:
                AcrescentarUmaExpressao("8",true);
                break;

            case R.id.numero_nove:
                AcrescentarUmaExpressao("9",true);
                break;

            case R.id.ponto:
                AcrescentarUmaExpressao(".",true);
                break;

            case R.id.adicao:
                AcrescentarUmaExpressao("+",false);
                break;

            case R.id.subtracao:
                AcrescentarUmaExpressao("-",false);
                break;

            case R.id.multiplicacao:
                AcrescentarUmaExpressao("*",false);
                break;

            case R.id.divisao:
                AcrescentarUmaExpressao("/",false);
                break;
        }
    }
}

