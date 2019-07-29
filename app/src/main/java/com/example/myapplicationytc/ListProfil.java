package com.example.myapplicationytc;

public class ListProfil {
    private int gambar;
    private String judul;
    private String harga;

    public ListProfil(int gambarn, String juduln, String hargan){
        gambar=gambarn;
        judul=juduln;
        harga=hargan;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
