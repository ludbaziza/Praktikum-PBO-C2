package com.PolimorfismeInclusion;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
        this.bonus = bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
