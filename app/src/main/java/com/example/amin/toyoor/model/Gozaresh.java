package com.example.amin.toyoor.model;

public class Gozaresh {

    private int id;
    private String tarikh;
    private int senJojeh;
    private int tedadTalafat;
    private String Daroo;
    private String noeDanMasrafi;
    private int megdarDonMasrafi;
    private double mianginVazn;
    private int masrafeKolDon;
    private int damaSalon;
    private int tedadFroshMorg;
    private int tedadAvaliehJojehVorodi;
    private int baghimandehJojeh;

    public Gozaresh() {
    }

    public Gozaresh(int id, String tarikh, int senJojeh, int tedadTalafat,
                    String daroo, String noeDanMasrafi, int megdarDonMasrafi,
                    double mianginVazn, int masrafeKolDon, int damaSalon,
                    int tedadFroshMorg, int tedadAvaliehJojehVorodi,
                    int baghimandehJojeh) {
        this.id = id;
        this.tarikh = tarikh;
        this.senJojeh = senJojeh;
        this.tedadTalafat = tedadTalafat;
        Daroo = daroo;
        this.noeDanMasrafi = noeDanMasrafi;
        this.megdarDonMasrafi = megdarDonMasrafi;
        this.mianginVazn = mianginVazn;
        this.masrafeKolDon = masrafeKolDon;
        this.damaSalon = damaSalon;
        this.tedadFroshMorg = tedadFroshMorg;
        this.tedadAvaliehJojehVorodi = tedadAvaliehJojehVorodi;
        this.baghimandehJojeh = baghimandehJojeh;
    }

    public int getId() {
        return id;
    }

    public String getTarikh() {
        return tarikh;
    }

    public int getSenJojeh() {
        return senJojeh;
    }

    public int getTedadTalafat() {
        return tedadTalafat;
    }

    public String getDaroo() {
        return Daroo;
    }

    public String getNoeDanMasrafi() {
        return noeDanMasrafi;
    }

    public int getMegdarDonMasrafi() {
        return megdarDonMasrafi;
    }

    public double getMianginVazn() {
        return mianginVazn;
    }

    public int getMasrafeKolDon() {
        return masrafeKolDon;
    }

    public int getDamaSalon() {
        return damaSalon;
    }

    public int getTedadFroshMorg() {
        return tedadFroshMorg;
    }

    public int getTedadAvaliehJojehVorodi() {
        return tedadAvaliehJojehVorodi;
    }

    public int getBaghimandehJojeh() {
        return baghimandehJojeh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTarikh(String tarikh) {
        this.tarikh = tarikh;
    }

    public void setSenJojeh(int senJojeh) {
        this.senJojeh = senJojeh;
    }

    public void setTedadTalafat(int tedadTalafat) {
        this.tedadTalafat = tedadTalafat;
    }

    public void setDaroo(String daroo) {
        Daroo = daroo;
    }

    public void setNoeDanMasrafi(String noeDanMasrafi) {
        this.noeDanMasrafi = noeDanMasrafi;
    }

    public void setMegdarDonMasrafi(int megdarDonMasrafi) {
        this.megdarDonMasrafi = megdarDonMasrafi;
    }

    public void setMianginVazn(double mianginVazn) {
        this.mianginVazn = mianginVazn;
    }

    public void setMasrafeKolDon(int masrafeKolDon) {
        this.masrafeKolDon = masrafeKolDon;
    }

    public void setDamaSalon(int damaSalon) {
        this.damaSalon = damaSalon;
    }

    public void setTedadFroshMorg(int tedadFroshMorg) {
        this.tedadFroshMorg = tedadFroshMorg;
    }

    public void setTedadAvaliehJojehVorodi(int tedadAvaliehJojehVorodi) {
        this.tedadAvaliehJojehVorodi = tedadAvaliehJojehVorodi;
    }

    public void setBaghimandehJojeh(int baghimandehJojeh) {
        this.baghimandehJojeh = baghimandehJojeh;
    }

}
