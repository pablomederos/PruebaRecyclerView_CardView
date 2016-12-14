package com.pmcoder.pruebarecyclerview.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pmcoder.pruebarecyclerview.R;
import com.pmcoder.pruebarecyclerview.recyclerview.Adaptador;
import com.pmcoder.pruebarecyclerview.recyclerview.Etiquetas;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class mainFragment extends Fragment {


    public mainFragment() {
        // Required empty public constructor
    }

    public ArrayList<Etiquetas> tema = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardrecyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adaptador adaptador = new Adaptador(crearEtiquetas(),R.layout.cardview,getActivity());
        recyclerView.setAdapter(adaptador);

        Button boton = (Button) view.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cargar();
            }
        });

        return view;
    }



    public ArrayList<Etiquetas> crearEtiquetas(){
        tema.add(new Etiquetas("https://s-media-cache-ak0.pinimg.com/originals/2f/01/31/2f0131d35ecab2259413fe5b5913e8cb.jpg","Long Boulevard"));
        tema.add(new Etiquetas("http://www.readwriteweb.es/wp-content/uploads/2016/08/Co%CC%81mo-instalar-fondos-de-pantalla-360-en-LG-G5-1-1.jpg","Multiples Colores"));
        tema.add(new Etiquetas("http://www.hdfondos.org/file/11350/728x410/16:9/frozen-mountain-with-old-grass_1482140081.jpg", "MountanView"));

        return tema;
    }

    public void Cargar(){

        TextView urlEdit = (TextView) getActivity().findViewById(R.id.url);
        TextView nameEdit = (TextView) getActivity().findViewById(R.id.name);

        String url = urlEdit.getText().toString();
        String name = nameEdit.getText().toString();

        switch (url.length()){
            case 0:
                break;
            default:
                if (url.length()>0){
                    Toast.makeText(getActivity(),"Creando la nueva tarjeta",Toast.LENGTH_LONG).show();
                    tema.add(new Etiquetas(url, name));
                }
        }
    }

}
