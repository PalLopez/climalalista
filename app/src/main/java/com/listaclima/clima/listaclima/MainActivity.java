package com.listaclima.clima.listaclima;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    ListView listaclima;
    ArrayList<Datos> listadelosdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaclima= (ListView) findViewById(R.id.Listaclima);
        listadelosdatos=new ArrayList<Datos>();
        listadelosdatos.add(new Datos(R.drawable.so, "Lunes", "Soleado", "40°c"));
        listadelosdatos.add(new Datos(R.drawable.so "Martes", "Soleado", "45°c"));
        listadelosdatos.add(new Datos(R.drawable.nu,"Miercoles","nublado","26°c"));
        listadelosdatos.add(new Datos(R.drawable.nu,"Jueves","Nublado","27°c"));
        listadelosdatos.add(new Datos(R.drawable.agua,"Viernes","lluvioso","20°c"));
        listadelosdatos.add(new Datos(R.drawable.agua,"Sabado","Lluvioso","25°c"));
       listadelosdatos.add(new Datos(R.drawable.so,"Domingo","Soleado","38°c"));
        Adaptador adapter = new Adaptador(listadelosdatos,MainActivity.this.getApplicationContext());
        listaclima.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
        int id = item.getItemId();

        
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
