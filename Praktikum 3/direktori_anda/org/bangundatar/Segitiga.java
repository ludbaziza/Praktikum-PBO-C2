/**
 * File : PersegiPanjang.java 08/03/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon
 */
 
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas,double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return 0.5*alas*tinggi;
	}
	
	public void printInfo(){
		System.out.println("\nBangun Segitiga bersisi "+ this.getJumlahSisi());
	}
}