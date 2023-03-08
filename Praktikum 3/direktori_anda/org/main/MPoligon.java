/**
 * File : MPoligon.Java 08/03/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : driver class untuk poligon dan persegi panjang
 */
 
package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
		
		Segitiga tiga = new Segitiga(4, 4, 3);
		tiga.printInfo();
		System.out.println("Luas segitiga: " + tiga.hitungLuas());
		
	}
}