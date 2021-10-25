package com.example.elieldazgalindo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Producto> listaProducto;
    private ProductosAdapter productosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaProducto = new ArrayList<>();

        listaProducto.add(new Producto("Almohada Megumin",R.drawable.megumin,150.1f, false));
        listaProducto.add(new Producto("Figura Sayu", R.drawable.sayu, 150, true));
        listaProducto.add(new Producto("Figura Asuna", R.drawable.asuna, 150, true));
        listaProducto.add(new Producto("Figura Chise", R.drawable.chise, 150, true));
        listaProducto.add(new Producto("Figura kuroha", R.drawable.kuroha, 150, true));
        listaProducto.add(new Producto("Figura Lucy", R.drawable.lucy, 150, true));
        listaProducto.add(new Producto("Almohada Sasha Necron", R.drawable.sasha, 150, true));
        listaProducto.add(new Producto("Sudadera Ahegao", R.drawable.ahego, 150, true));


        productosAdapter = new ProductosAdapter(getApplicationContext(),0, listaProducto);
        ListView listView = findViewById(R.id.listViewProducto);
        listView.setAdapter(productosAdapter);
    }
}