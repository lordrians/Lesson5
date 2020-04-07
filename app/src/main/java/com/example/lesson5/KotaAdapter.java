package com.example.lesson5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KotaAdapter extends RecyclerView.Adapter<KotaAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Kota> kotaArrayList;

    public KotaAdapter(ArrayList<Kota> list, Context applicationContext) {
        this.context = applicationContext;
        this.kotaArrayList =list;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.namaKota.setText(kotaArrayList.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return kotaArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView namaKota;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            namaKota = itemView.findViewById(R.id.nama_kota);
        }
    }
}
