package com.PolimorfismeInclusion;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        setNama(nama);
        this.tunjangan = tunjangan;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
