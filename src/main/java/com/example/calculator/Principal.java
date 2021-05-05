package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Principal extends AppCompatActivity {

    Double num1, num2, resultado;
    int operador;

    // creo la contante del resultado
    public  static final String EXTRA_MESSAGE = "com.example.principal.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    /**
     * metodo del boton igual, hace que se realice las operaciones mediante unos filtros y envia el
     * resultado a la ActivityResultado
     * @param view
     */
    public void resultado (View view){

        // meto el textView dentro de la variable num2 con un parse para convertir la cadena de texto a double
        TextView tv = findViewById(R.id.textView);
        num2 = Double.parseDouble(tv.getText().toString());

        // miramos que boton de operacion se ha hecho clic (como una especie de menú)
        if (operador==1){
            resultado = num1+num2;
        }
        if (operador==2){
            resultado = num1-num2;
        }
        if (operador==3){
            resultado = num1/num2;
        }
        if (operador==4){
            resultado = num1*num2;
        }
        // meto el resultado como un mensaje que se envia a la ActivityResultado para que muestre el resultado
        Intent intent = new Intent(this, ActivityResultado.class);
        String message = resultado.toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * metodo que guarda el primer valor que introducimos en la calculadora
     * @param view
     */
    public void guardarNum1 (View view){
        //guardo el valor del textView
        TextView tv = findViewById(R.id.textView);
        num1 = Double.parseDouble(tv.getText().toString());
        // limpio el textView para el siguiente numero
        tv.setText("");
    }

    /**
     * Cambia el valor del operador para saber luego que operacion hay que realizar
     * @param view
     */
    public void botonSuma (View view){
       operador = 1;
       // guardo el valor que se ha escrito en el textView en la variable num1
        guardarNum1(view);
    }

    public void botonResta (View view){
        operador = 2;
        // guardo el valor que se ha escrito en el textView en la variable num1
        guardarNum1(view);
    }
    public void botonDivision (View view){
        operador = 3;
        // guardo el valor que se ha escrito en el textView en la variable num1
        guardarNum1(view);
    }
    public void botonMultiplicacion (View view){
        operador = 4;
        // guardo el valor que se ha escrito en el textView en la variable num1
        guardarNum1(view);
    }

    /**
     * boton para borrar toda la operacion
     * @param view
     */
    public void botonBorrarTodo(View view){
        num1 = 0.0;
        num2 = 0.0;
        TextView tv = findViewById(R.id.textView);
        tv.setText("");
    }

    /**
     * metodo que borra el ultimo digito del numero que estamos escribiendo
     * @param view
     */
    public void borrarUltimaCifra (View view){
        TextView tv = findViewById(R.id.textView);
        String str = tv.getText().toString();
        str = str.substring(0, str.length()-1);
        tv.setText(str.toString());
    }
    /**
     * metodo de los botones numericos, editamos el textView y vamos concatenando los numeros que
     * que vamos marcando o la coma
     * @param view
     */
    public void boton1 (View view){
        // concatenamos el numero 1, lo tenemos que concatenar para no perder los valores puestos
        // antes (para cuando pongamos numero de mas de 1 cifa)
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "1");
    }
    public void boton2 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "2");
    }
    public void boton3 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "3");
    }
    public void boton4 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "4");
    }
    public void boton5 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "5");
    }
    public void boton6 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "6");
    }
    public void boton7 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "7");
    }
    public void boton8 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "8");
    }
    public void boton9 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "9");
    }
    public void boton0 (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + "0");
    }
    public void botonComa (View view){
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText() + ".");
    }
}