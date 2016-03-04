package edu.galileo.superheroesfinal.superheroesfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Superh> list = new ArrayList<Superh>();
    int[] imagenes = {R.drawable.cptnamrc,R.drawable.flash,R.drawable.irnmn,R.drawable.spdrmn,R.drawable.sprmn,R.drawable.thor,R.drawable.wlvrn};
    String[] nombre,descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = getResources().getStringArray(R.array.superheroes_nombres);
        descripcion = getResources().getStringArray(R.array.superheroes_descripcion);
        int count=0;
        for(String Nombre : nombre){
            Superh superh = new Superh(imagenes[count],Nombre,descripcion[count]);
            count++;
            list.add(superh);

        }
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new SuperAdapter(list,this);
        recyclerView.setAdapter(adapter);


    }
}
