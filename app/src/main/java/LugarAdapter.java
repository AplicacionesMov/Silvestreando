package com.example.silvestreando2026;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.LugarViewHolder> {

    private final List<Lugar> lugares;

    public LugarAdapter(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    @NonNull
    @Override
    public LugarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lugar, parent, false);
        return new LugarViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull LugarViewHolder holder, int position) {
        Lugar lugar = lugares.get(position);
        holder.ivLugar.setImageResource(lugar.getImagen());
        holder.tvNombre.setText(lugar.getNombre());
        holder.tvDepartamento.setText(lugar.getDepartamento());
        holder.tvDescripcion.setText(lugar.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    static class LugarViewHolder extends RecyclerView.ViewHolder {
        ImageView ivLugar;
        TextView tvNombre, tvDepartamento, tvDescripcion;

        LugarViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLugar = itemView.findViewById(R.id.ivLugar);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvDepartamento = itemView.findViewById(R.id.tvDepartamento);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }
}