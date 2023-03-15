/**
 * File : MKubus.Java 15/03/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : driver class untuk poligon dan MKubus
 */
 
package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujur = new BujurSangkar(10);
		Kubus kubus = new Kubus(bujur);
		System.out.println("\nLuas BujurSangkar : " + kubus.hitungLuasAlas());
		System.out.println("Volume BujurSangkar : " + kubus.hitungVolume());
	}
}