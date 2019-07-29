package com.example.myapplicationytc;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterProfil extends ArrayAdapter {
    List list = new ArrayList();

    public AdapterProfil(@NonNull Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler{
        ImageView gambar;
        TextView judul;
        TextView harga;
    }

    @Override
    public void add(@Nullable Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        view=((Activity)getContext()).getLayoutInflater().inflate(R.layout.list_profil,null);
        AdapterProfil.DataHandler handler;
        ListProfil profil =(ListProfil) this.getItem(position);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.list_course, parent, false);

            handler = new AdapterProfil.DataHandler();
            handler.gambar = view.findViewById(R.id.logoProfil);
            handler.judul = view.findViewById(R.id.namaProfil);
            handler.harga = view.findViewById(R.id.hargaProfil);
//            view.setTag(handler);
        }
        else{
            handler= (AdapterProfil.DataHandler) view.getTag();
        }

        handler.gambar.setImageResource(profil.getGambar());
        handler.judul.setText(profil.getJudul());
        handler.harga.setText(profil.getHarga());
        return view;
    }
}
