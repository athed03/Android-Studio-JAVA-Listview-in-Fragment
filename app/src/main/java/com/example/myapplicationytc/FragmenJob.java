package com.example.myapplicationytc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmenJob extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_job, container, false);
        ListView listView = view.findViewById(R.id.list_job);

        AdapterJob adapterJob = new AdapterJob(getActivity(),R.layout.list_job);
        listView.setAdapter(adapterJob);
        for (int i=0;i<10;i++){
            ListJob listJob= new ListJob(R.drawable.ic_job,"Programmer","20000");
            adapterJob.add(listJob);
        }
        return view;
    }
}