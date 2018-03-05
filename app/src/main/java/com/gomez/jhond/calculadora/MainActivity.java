package com.gomez.jhond.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    Button bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve, bCero;
    TextView tDisplay;
    String display="";
    double num1 , num2, rfinal;
    int recurrente, operacion, otronum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bUno = findViewById(R.id.bUno);
        bDos = findViewById(R.id.bDos);
        bTres = findViewById(R.id.bTres);
        bCuatro = findViewById(R.id.bCuatro);
        bCinco = findViewById(R.id.bCinco);
        bSeis = findViewById(R.id.bSeis);
        bSiete = findViewById(R.id.bSiete);
        bOcho = findViewById(R.id.bOcho);
        bNueve = findViewById(R.id.bNueve);
        bCero = findViewById(R.id.bCero);
        tDisplay = findViewById(R.id.tDisplay);


    }

    public void Calcular(View view) {

        int id=view.getId();

        switch (id){
            case R.id.bCero:
                display= display + "0";
                break;
            case R.id.bUno:
                display = display + "1";
                break;
            case R.id.bDos:
                display= display + "2";
                break;
            case R.id.bTres:
                display= display + "3";
                break;
            case R.id.bCuatro:
                display= display + "4";
                break;
            case R.id.bCinco:
                display= display + "5";
                break;
            case R.id.bSeis:
                display= display + "6";
                break;
            case R.id.bSiete:
                display= display + "7";
                break;
            case R.id.bOcho:
                display= display + "8";
                break;
            case R.id.bNueve:
                display= display + "9";
                break;
            case R.id.bPunto:
                display=display + ".";
                break;
            case R.id.bSuma:
                if(!display.equals("")){
                    String last=display.substring(display.length()-1,display.length());
                    
                    if(!last.equals("+")&&!last.equals("-")&&!last.equals("*")&&!last.equals("/")&&!last.equals("%")){
                        if(recurrente==1)display=Double.toString(rfinal);                      
                        num1=Double.parseDouble(display);
                        display=display+"+";
                        otronum=display.length();
                        operacion=1;
                        recurrente=0;
                    }
                }
                break;
            case R.id.bResta:
                if(!display.equals("")){
                    String last=display.substring(display.length()-1,display.length());
                    if(!last.equals("+")&&!last.equals("-")&&!last.equals("*")&&!last.equals("/")&&!last.equals("%")){
                        if(recurrente==1)display=Double.toString(rfinal);
                        num1=Double.parseDouble(display);
                        display=display+"-";
                        otronum=display.length();
                        operacion=2;
                        recurrente=0;
                    }
                }
                break;
            case R.id.bMult:
                if(!display.equals("")){
                    String last=display.substring(display.length()-1,display.length());
                    if(!last.equals("+")&&!last.equals("-")&&!last.equals("*")&&!last.equals("/")&&!last.equals("%")){
                        if(recurrente==1)display=Double.toString(rfinal);
                        num1=Double.parseDouble(display);
                        display=display+"*";
                        otronum=display.length();
                        operacion=3;
                        recurrente=0;
                    }
                }
                break;
            case R.id.bDiv:
                if(!display.equals("")){
                    String last=display.substring(display.length()-1,display.length());
                    if(!last.equals("+")&&!last.equals("-")&&!last.equals("*")&&!last.equals("/")&&!last.equals("%")){
                        if(recurrente==1)display=Double.toString(rfinal);
                        num1=Double.parseDouble(display);
                        display=display+"/";
                        otronum=display.length();
                        operacion=4;
                        recurrente=0;
                    }
                }
                break;
            case R.id.bModulo:
                if(!display.equals("")){
                    String last=display.substring(display.length()-1,display.length());
                    if(!last.equals("+")&&!last.equals("-")&&!last.equals("*")&&!last.equals("/")&&!last.equals("%")){
                        if(recurrente==1)display=Double.toString(rfinal);
                        num1=Double.parseDouble(display);
                        display=display+"%";
                        otronum=display.length();
                        operacion=5;
                        recurrente=0;
                    }
                }
                break;
            case R.id.bAC:
                display="";
                recurrente=0;
                operacion=7;
                break;
            case R.id.bIgual:
                num2=Double.parseDouble(display.substring(otronum,display.length()));
                if(operacion==1)rfinal=num1+num2;
                if(operacion==2)rfinal=num1-num2;
                if(operacion==3)rfinal=num1*num2;
                if(operacion==4)rfinal=num1/num2;
                if(operacion==5)rfinal=num1%num2;
                operacion=6;
                break;
        }
        if(operacion==6){
            tDisplay.setText(Double.toString(rfinal));
            recurrente=1;
        }
        else if(operacion==7){
            tDisplay.setText(display.toString());
        }
        else tDisplay.setText(display.toString());
    }
}
