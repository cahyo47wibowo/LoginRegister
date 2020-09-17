package com.androidtutorialshub.loginregister.model;

import java.util.Date;

class Transaction {
    int Id;
    String Nama_Barang;
    int Qty;
    Date Exp_date;
    double harga;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String nama_Barang) {
        Nama_Barang = nama_Barang;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public Date getExp_date() {
        return Exp_date;
    }

    public void setExp_date(Date exp_date) {
        Exp_date = exp_date;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
