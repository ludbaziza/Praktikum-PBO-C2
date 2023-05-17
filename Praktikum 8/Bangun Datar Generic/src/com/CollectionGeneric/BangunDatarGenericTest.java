package com.CollectionGeneric;

/*
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk Generic BangunDatar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling()); 
        System.out.println("tipe generic : " +bdg.get().getClass().getName()); 

        Segitiga stg = new Segitiga(4, 5);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(stg);
        System.out.println("Keliling Segitiga : " +bdgSegitiga.hitungKeliling()); 
        System.out.println("tipe generic : " +bdgSegitiga.get().getClass().getName()); 
    }
}
