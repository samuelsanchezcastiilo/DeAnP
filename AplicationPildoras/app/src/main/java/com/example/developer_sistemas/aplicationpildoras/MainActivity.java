package com.example.developer_sistemas.aplicationpildoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador ;
    TextView testoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        testoResultado = (TextView)findViewById(R.id.contador);
    }

    public void incrementar(View view)
    {
        contador ++;
        testoResultado.setText(String.valueOf(contador));
    }

    public void decremneto(View view)
    {
        contador --;

        if (contador<0)
        {
            CheckBox negativos =(CheckBox)findViewById(R.id.checkbos);

            if (!negativos.isChecked()) {
                contador = 0;
            }

        }
        testoResultado.setText(String.valueOf(contador));
    }


    public void resetear()
    {
        EditText numero_reset = (EditText)findViewById(R.id.n_reseteo);
        try
        {
            testoResultado.setText(String.valueOf(contador));
        }catch (Exception e)
        {
            contador = 0;
        }



        contador = Integer.parseInt(numero_reset.getText().toString());


    }



}
