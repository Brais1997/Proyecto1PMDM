package com.example.balva.proxecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PrimeraActivity extends AppCompatActivity {

    EditText nombre;
    private int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primera);
        nombre =(EditText)findViewById(R.id.nombre);
    }

    public void abrirActivity(View v){
        Intent i = new Intent(this,Segunda.class);
        i.putExtra("nombre",nombre.getText().toString());
        startActivityForResult(i,REQUEST_CODE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Toast.makeText(getBaseContext(),"Bienvenido " + data.getExtras().getString("RESULTADO"),Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getBaseContext(),"Introduzca su verdadero nombre",Toast.LENGTH_LONG).show();
            }
        }
    }
}
