package com.example.amin.toyoor.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amin.toyoor.FakeDataGozaresh;
import com.example.amin.toyoor.R;
import com.example.amin.toyoor.adapter.GozareshRecyclerAdapter;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * A simple {@link Fragment} subclass.
 */
public class GozareshFragment extends Fragment {

    View view;
    RecyclerView rv;
    GozareshRecyclerAdapter gozareshRecyclerAdapter;



    public GozareshFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_gozaresh,
                container, false);
        rv = view.findViewById(R.id.recycler_view_gozaresh);
        gozareshRecyclerAdapter = new GozareshRecyclerAdapter(getContext(),
                FakeDataGozaresh.getFakeGozaresh());
        rv.setLayoutManager(new LinearLayoutManager(
                getContext(), LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(gozareshRecyclerAdapter);
        gozareshRecyclerAdapter.notifyDataSetChanged();
        //rv.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

}