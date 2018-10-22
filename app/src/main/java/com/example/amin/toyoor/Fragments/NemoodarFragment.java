package com.example.amin.toyoor.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.example.amin.toyoor.R;
import com.jonas.jgraph.graph.JcoolGraph;
import com.jonas.jgraph.models.Jchart;

import static com.jonas.jgraph.inter.BaseGraph.SELECETD_MSG_SHOW_TOP;

/**
 * A simple {@link Fragment} subclass.
 */
public class NemoodarFragment extends Fragment {

    JcoolGraph jcoolGraph;

    public NemoodarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nemoodar, container, false);

        jcoolGraph = view.findViewById(R.id.sug_recode_line);
        jcoolGraph.feedData(2f,45f,22f, 10f, 33f, 22f, 53f,45f,20f,34f,50f);
        jcoolGraph.setLineStyle(JcoolGraph.LINE_CURVE);
        jcoolGraph.setPaintShaderColors(Color.RED, Color.parseColor("#E79D23"),Color.parseColor("#FFF03D"), Color.parseColor("#A9E16F"), Color.parseColor("#75B9EF"));
        jcoolGraph.setShaderAreaColors(Color.parseColor("#2980b9"), Color.TRANSPARENT);
        jcoolGraph.setSelectedMode(SELECETD_MSG_SHOW_TOP);
        jcoolGraph.setScrollAble(true);
        jcoolGraph.setVisibleNums(5);





        return view;
    }

}
