package edu.galileo.superheroesfinal.superheroesfinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rzurita on 02/03/2016.
 */


public class SuperAdapter extends RecyclerView.Adapter<SuperAdapter.SuperViewHolder>{
    ArrayList<Superh> superhs = new ArrayList<Superh>();
    Context ctx;

    public SuperAdapter(ArrayList<Superh> superhs, Context ctx){
    this.superhs = superhs;
    this.ctx = ctx;
    }

    @Override
    public SuperViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        SuperViewHolder superViewHolder = new SuperViewHolder(view,ctx,superhs);

        return superViewHolder;
    }

    @Override
    public void onBindViewHolder(SuperViewHolder holder, int position) {
        Superh nom = superhs.get(position);
        holder.imagen_superheroe.setImageResource(nom.getImagen());
        holder.nombre_superheroe.setText(nom.getNombre());
        holder.descripcion_superheroe.setText(nom.getDescripcion());

    }

    @Override
    public int getItemCount() {
        return superhs.size();
    }

    public static class SuperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imagen_superheroe;
        TextView nombre_superheroe;
        TextView descripcion_superheroe;
        ArrayList<Superh> superhs = new ArrayList<Superh>();
        Context ctx;

        public SuperViewHolder(View view,Context ctx,ArrayList<Superh> superhs){
            super(view);
            this.superhs=superhs;
            this.ctx=ctx;
            view.setOnClickListener(this);
            imagen_superheroe = (ImageView) view.findViewById(R.id.imagencard);
            nombre_superheroe = (TextView)  view.findViewById(R.id.nombrecard);
            descripcion_superheroe = (TextView)  view.findViewById(R.id.descripcioncard);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Superh superh = this.superhs.get(position);
            Intent intent = new Intent(this.ctx,Main2Activity.class);
            intent.putExtra("image_id",superh.getImagen());
            intent.putExtra("nombre_id",superh.getNombre());
            intent.putExtra("desc_id",superh.getDescripcion());
            this.ctx.startActivity(intent);

        }
    }


}
