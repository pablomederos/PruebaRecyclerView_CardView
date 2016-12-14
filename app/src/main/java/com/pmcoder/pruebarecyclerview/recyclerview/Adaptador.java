package com.pmcoder.pruebarecyclerview.recyclerview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import static com.pmcoder.pruebarecyclerview.R.id.container;
import com.pmcoder.pruebarecyclerview.MainActivity;
import com.pmcoder.pruebarecyclerview.R;
import com.pmcoder.pruebarecyclerview.fragments.imageFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Pablo on 12/12/2016.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder>{

    private ArrayList<Etiquetas> etiquetas = new ArrayList<>();
    private int recurso;
    private Activity actividad;

    public Adaptador(ArrayList<Etiquetas> etiquetas, int recurso, Activity actividad) {
        this.etiquetas = etiquetas;
        this.recurso = recurso;
        this.actividad = actividad;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(recurso,parent,false);
    return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Etiquetas img = etiquetas.get(position);
        holder.name.setText(img.getNombreImg());
        Picasso.with(actividad).load(img.getImg()).into(holder.urlImg);
        holder.urlImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = new MainActivity();
                mainActivity.imagen();
            }
        });
    }

    @Override
    public int getItemCount() {
        return etiquetas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView urlImg;
        private TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            urlImg = (ImageView) itemView.findViewById(R.id.imageCard);
            name = (TextView) itemView.findViewById(R.id.textViewCard);
        }
    }

}
