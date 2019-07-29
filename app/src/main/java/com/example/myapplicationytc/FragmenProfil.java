package com.example.myapplicationytc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmenProfil extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_profil, container, false);
        ListView listView = view.findViewById(R.id.list_profil);

        AdapterProfil adapterProfil = new AdapterProfil(getActivity(),R.layout.list_profil);
        listView.setAdapter(adapterProfil);
        for (int i=0;i<10;i++){
            ListProfil listProfil = new ListProfil(R.drawable.ic_job,"Programmer","20000");
            adapterProfil.add(listProfil);
        }
        return view;
    }
}
