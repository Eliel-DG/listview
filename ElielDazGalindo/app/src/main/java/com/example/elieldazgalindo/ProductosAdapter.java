package com.example.elieldazgalindo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ProductosAdapter extends ArrayAdapter<Producto> {

    ArrayList<Producto> listaProducto;

    public ProductosAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Producto> objects) {
        super(context, resource, objects);

        listaProducto = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        Producto productoActual = listaProducto.get(position);

        if (view == null ){
            view = LayoutInflater.from(getContext()).inflate(R.layout.lista, parent, false);
        }


        ImageView imagen = view.findViewById(R.id.imagenProducto);
        imagen.setImageResource(productoActual.getImagen());

        TextView ProducProducto = view.findViewById(R.id.etiquetaProduc);
        ProducProducto.setText(productoActual.getNombre());

        TextView OfertaProducto = view.findViewById(R.id.etiquetaOferta);
        OfertaProducto.setText(productoActual.getNombre());

        TextView PrecioProducto = view.findViewById(R.id.etiquetaPrecio);
        PrecioProducto.setText(productoActual.getNombre());

        return view;
    }
}
