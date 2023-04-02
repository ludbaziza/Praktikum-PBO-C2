/**
 * File : AngkaSialException.java 02/04/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}