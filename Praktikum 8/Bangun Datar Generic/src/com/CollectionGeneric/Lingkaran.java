package com.CollectionGeneric;

/*
 * File : Lingkaran.java
 * Deskripsi : Implementasi Lingkaran sebagai BangunDatar
 */
public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
