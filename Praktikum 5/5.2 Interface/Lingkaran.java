/**
 * File : Lingkaran.java 31/03/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : Kelas yang mengimplementasi IArea berupa cara menghitung luas lingkaran
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    public double jejari;
    public Lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}