package com.example.amin.toyoor.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.amin.toyoor.R;
import com.example.amin.toyoor.model.Gozaresh;


import java.util.List;

public class GozareshRecyclerAdapter extends
        RecyclerView.Adapter<GozareshRecyclerAdapter.GozareshViewHolder> {

    private Context context;
    private List<Gozaresh> gozareshList;
    private int lastPosition = -1;

    public GozareshRecyclerAdapter(Context context, List<Gozaresh> gozareshList) {
        this.context = context;
        this.gozareshList = gozareshList;
    }

    @NonNull
    @Override
    public GozareshViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(context).inflate(R.layout.row_layout_gozaresh_model
                , parent, false);
        return new GozareshViewHolder(view2);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final GozareshViewHolder holder, final int position) {
        Gozaresh appFeature = gozareshList.get(position);
        holder.txt_tarikh.setText(" " + appFeature.getTarikh());
        holder.txt_senJojeh.setText(" " + appFeature.getSenJojeh());
        holder.txt_tedadTalafat.setText(" " + appFeature.getTedadTalafat());
        holder.txt_Daroo.setText(" " + appFeature.getDaroo());
        holder.txt_noeDanMasrafi.setText(" " + appFeature.getNoeDanMasrafi());
        holder.txt_megdarDonMasrafi.setText(" " + appFeature.getMegdarDonMasrafi());
        holder.txt_mianginVazn.setText(" " + appFeature.getMianginVazn());
        holder.txt_masrafeKolDon.setText(" " + appFeature.getMasrafeKolDon());
        holder.txt_damaSalon.setText(" " + appFeature.getDamaSalon());
        holder.txt_tedadFroshMorg.setText(" " + appFeature.getTedadFroshMorg());
        holder.txt_tedadAvaliehJojehVorodi.setText(" " + appFeature.getTedadAvaliehJojehVorodi());
        holder.txt_baghimandehJojeh.setText(" " + appFeature.getBaghimandehJojeh());
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return gozareshList.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation
                    (context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        } else if (position == 0) {
            lastPosition = 0;
        } else if (position < lastPosition) {
            Animation animation = AnimationUtils.loadAnimation
                    (context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull GozareshViewHolder holder) {
        (holder).clearAnimation();
    }

    //Start Inner Class =============================================================
    static class GozareshViewHolder extends RecyclerView.ViewHolder {

        TextView txt_tarikh;
        TextView txt_senJojeh;
        TextView txt_tedadTalafat;
        TextView txt_Daroo;
        TextView txt_noeDanMasrafi;
        TextView txt_megdarDonMasrafi;
        TextView txt_mianginVazn;
        TextView txt_masrafeKolDon;
        TextView txt_damaSalon;
        TextView txt_tedadFroshMorg;
        TextView txt_tedadAvaliehJojehVorodi;
        TextView txt_baghimandehJojeh;
        CardView container;

        GozareshViewHolder(View itemView) {
            super(itemView);
            txt_tarikh = itemView.findViewById(R.id.txt_tarikh);
            txt_senJojeh = itemView.findViewById(R.id.txt_senJojeh);
            txt_tedadTalafat = itemView.findViewById(R.id.txt_tedadTalafat);
            txt_Daroo = itemView.findViewById(R.id.txt_Daroo);
            txt_noeDanMasrafi = itemView.findViewById(R.id.txt_noeDanMasrafi);
            txt_megdarDonMasrafi = itemView.findViewById(R.id.txt_megdarDonMasrafi);
            txt_mianginVazn = itemView.findViewById(R.id.txt_mianginVazn);
            txt_masrafeKolDon = itemView.findViewById(R.id.txt_masrafeKolDon);
            txt_damaSalon = itemView.findViewById(R.id.txt_damaSalon);
            txt_tedadFroshMorg = itemView.findViewById(R.id.txt_tedadFroshMorg);
            txt_tedadAvaliehJojehVorodi = itemView.findViewById(R.id.txt_tedadAvaliehJojehVorodi);
            txt_baghimandehJojeh = itemView.findViewById(R.id.txt_baghimandehJojeh);
            container = itemView.findViewById(R.id.row_fragment_gozaresh);
        }

        void clearAnimation() {
            container.clearAnimation();
        }

    }//End Inner Class =============================================================

}
