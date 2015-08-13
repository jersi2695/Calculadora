package kepler.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class Calculadora extends ActionBarActivity {


    private String a, operador, b;


    // Numbers
    private Button boton0;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private Button boton8;
    private Button boton9;

    // Operations
    private Button mas, menos, por, dividir, igual;

    // Clean
    private Button AC, CE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView texto = (TextView) findViewById(R.id.operaciones);
        a = "";
        operador= "";
        b = "";

        AC = (Button) findViewById(R.id.AC);
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= "";
                operador ="";
                b= "";
                texto.setText("");
            }
        });

        CE = (Button) findViewById(R.id.CE);
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!b.equals("")){
                    b = b.substring(0, b.length() - 2);
                }else if (!operador.equals("")){
                    operador="";
                }else{
                    a = a.substring(0, a.length() - 2);
                }
                texto.setText(a + operador + b);
            }
        });


        boton0 = (Button) findViewById(R.id.cero);
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(operador.equals("")){
                    a+= "0";
                }else{
                    b+= "0";
                }
                texto.setText(a + operador + b);
            }
        });

        boton1 = (Button) findViewById(R.id.uno);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "1";
                }else{
                    b+= "1";
                }
                texto.setText(a + operador + b);

            }
        });

        boton2 = (Button) findViewById(R.id.dos);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "2";
                }else{
                    b+= "2";
                }
                texto.setText(a + operador + b);
            }

        });

        boton3 = (Button) findViewById(R.id.tres);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "3";
                }else{
                    b+= "3";
                }
                texto.setText(a + operador + b);
            }
        });

        boton4 = (Button) findViewById(R.id.cuatro);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "4";
                }else{
                    b+= "4";
                }
                texto.setText(a + operador + b);
            }
        });

        boton5 = (Button) findViewById(R.id.cinco);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "5";
                }else{
                    b+= "5";
                }
                texto.setText(a + operador + b);
            }
        });

        boton6 = (Button) findViewById(R.id.seis);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "6";
                }else{
                    b+= "6";
                }
                texto.setText(a + operador + b);
            }
        });

        boton7 = (Button) findViewById(R.id.siete);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "7";
                }else{
                    b+= "7";
                }
                texto.setText(a + operador + b);
            }
        });

        boton8 = (Button) findViewById(R.id.ocho);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "8";
                }else{
                    b+= "8";
                }
                texto.setText(a + operador + b);
            }
        });

        boton9 = (Button) findViewById(R.id.nueve);
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operador.equals("")){
                    a+= "9";
                }else{
                    b+= "9";
                }
                texto.setText(a + operador + b);
            }
        });

        mas = (Button) findViewById(R.id.mas);
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!a.equals("") && b.equals("") && operador.equals("")){

                    operador = "+";
                    texto.setText(a + operador + b);
                }
            }
        });

        menos = (Button) findViewById(R.id.menos);
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!a.equals("") && b.equals("") && operador.equals("")){

                    operador = "-";
                    texto.setText(a + operador + b);
                }
            }
        });

        por = (Button) findViewById(R.id.por);
        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!a.equals("") && b.equals("") && operador.equals("")){

                    operador = "*";
                    texto.setText(a + operador + b);
                }
            }
        });

        dividir = (Button) findViewById(R.id.dividir);
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!a.equals("") && b.equals("") && operador.equals("")){

                    operador = "/";
                    texto.setText(a + operador + b);
                }
            }
        });

        igual = (Button)findViewById(R.id.igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = operar();
                EditText result = (EditText) findViewById(R.id.resultado);
                a = resultado + "";
                operador = "";
                b = "";
                result.setText(resultado);
            }
        });


        setContentView(R.layout.activity_calculadora);
    }


    public int operar(){
        if(!a.equals("") && !b.equals("") && !operador.equals("")){
            int na = Integer.parseInt(a);
            int nb = Integer.parseInt(b);
            char ope = operador.charAt(0);

            switch (ope){
                case '+':
                    return na + nb;
                case '-':
                    return  na - nb;
               case '/':
                    return na / nb;
               case '*':
                    return na * nb;
               default:
                    return 0;
            }
        }
        return 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
