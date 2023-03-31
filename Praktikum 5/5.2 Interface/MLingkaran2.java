/**
 * File : MLingkaran2.java 31/03/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : Kelas yang berisi driver untuk kelas lingkaran
 */

import java.util.Scanner;

public class MLingkaran2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        scan.close();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + l.jejari + " adalah " + l.hitungLuas());
    }
}