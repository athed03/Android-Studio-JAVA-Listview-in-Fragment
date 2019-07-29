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

public class AdapterJob extends ArrayAdapter {
    List list = new ArrayList();

    public AdapterJob(@NonNull Context context, int resource) {
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
        view=((Activity)getContext()).getLayoutInflater().inflate(R.layout.list_job,null);
        AdapterJob.DataHandler handler;
        ListJob job =(ListJob) this.getItem(position);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.list_course, parent, false);

            handler = new AdapterJob.DataHandler();
            handler.gambar = view.findViewById(R.id.logoJob);
            handler.judul = view.findViewById(R.id.namaJob);
            handler.harga = view.findViewById(R.id.hargaJob);
//            view.setTag(handler);
        }
        else{
            handler= (AdapterJob.DataHandler) view.getTag();
        }

        handler.gambar.setImageResource(job.getGambar());
        handler.judul.setText(job.getJudul());
        handler.harga.setText(job.getHarga());
        return view;
    }
}
