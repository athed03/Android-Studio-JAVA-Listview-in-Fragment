package com.example.myapplicationytc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmenCourse extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_course, container, false);

        ListView listView = view.findViewById(R.id.listCourse);

        AdapterCourse adapterCourse = new AdapterCourse(getActivity(),R.layout.list_course);
        listView.setAdapter(adapterCourse);
        for (int i=0;i<10;i++){
            ListCourse listCourse = new ListCourse(R.drawable.ic_job,"Programmer","20000");
            adapterCourse.add(listCourse);
        }


        return view;
    }
}
