package com.example.amin.toyoor.activity;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.amin.toyoor.Fragments.GozareshFragment;
import com.example.amin.toyoor.Fragments.NemoodarFragment;
import com.example.amin.toyoor.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends AppCompatActivity {

    CardView cardView;
    LinearLayout nemoodarBtn;
    LinearLayout gozareshBtn;
    ImageView nemoodarImage;
    ImageView gozareshImage;
    TextView nemoodarTxt;
    TextView gozareshTxt;
    GozareshFragment gozareshFragment = new GozareshFragment();
    NemoodarFragment nemoodarFragment = new NemoodarFragment();

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        workViews();
        showNemoodarFragment();

    }

    private void workViews() {

        nemoodarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!nemoodarFragment.isVisible()){

                    nemoodarImage.setColorFilter(Color.WHITE);
                    nemoodarTxt.setTextColor(Color.WHITE);
                    gozareshImage.setColorFilter(Color.parseColor("#BFCCFF"));
                    gozareshTxt.setTextColor(Color.parseColor("#BFCCFF"));

                    nemoodarBtn.animate().setDuration(200).scaleX(1f);
                    gozareshBtn.animate().setDuration(10).scaleX(1f);

                    removeFragments();
                    showNemoodarFragment();
                }
            }
        });

        gozareshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!gozareshFragment.isVisible()){
                    nemoodarImage.setColorFilter(Color.parseColor("#BFCCFF"));
                    nemoodarTxt.setTextColor(Color.parseColor("#BFCCFF"));
                    gozareshImage.setColorFilter(Color.WHITE);
                    gozareshTxt.setTextColor(Color.WHITE);


                    nemoodarBtn.animate().setDuration(10).scaleX(1f);
                    gozareshBtn.animate().setDuration(200).scaleX(1f);

                    removeFragments();
                    showGozareshFragment();
                }
            }
        });

    }

    private void initViews(){
        cardView=findViewById(R.id.card_view_for_frame);
        nemoodarBtn =findViewById(R.id.nemoodar_btn);
        gozareshBtn=findViewById(R.id.gozaresh_btn);
        nemoodarImage=findViewById(R.id.nemoodar_Image);
        gozareshImage=findViewById(R.id.gozaresh_image);
        nemoodarTxt=findViewById(R.id.nemoodar_txt);
        gozareshTxt=findViewById(R.id.gozaresh_txt);
    }


    public void showGozareshFragment() {


        if (!gozareshFragment.isVisible()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frame_gozareshha, gozareshFragment);
            fragmentTransaction.commit();
        }
        cardView.setCardElevation(25f);
    }


    public void showNemoodarFragment() {


        if (!nemoodarFragment.isVisible()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frame_for_fragments, nemoodarFragment);
            fragmentTransaction.commit();
        }

    }



    public void removeFragments() {

        if (gozareshFragment.isVisible()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(gozareshFragment);
            fragmentTransaction.commit();
            cardView.setCardElevation(0f);
        }


        if (nemoodarFragment.isVisible()) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(nemoodarFragment);
            fragmentTransaction.commit();

        }

    }


}
