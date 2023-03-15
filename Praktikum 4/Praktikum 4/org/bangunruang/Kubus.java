/**
 * File : Kubus.Java 15/03/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : driver class untuk bangundatar dan Kubus
 */
 
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}
	
	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
}


