package com.PersistentObject;

/* 
 * File : LambdaHashmap.java  (06/06/2023)
 * Penulis : Muhammad Abdul Aziz (24060121140150) 
 * Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
*/

import java.util.HashMap;

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140150", "Muhammad Abdul Aziz");
        mahasiswaMap.put("24060123456789", "KennyS");
        mahasiswaMap.put("24060112234567", "S1mple");
        mahasiswaMap.put("24060123344556", "zyWoo");

        // menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}
