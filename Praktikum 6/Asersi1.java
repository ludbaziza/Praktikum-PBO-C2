/**
 * File : Asersi1.java 02/04/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : Program untuk menunjukkan asersi
 */
public class Asersi1{
    public static void  main(String[] args) {
        int x = 0;
        if(x > 0){
            System.out.println("x bilngan positif");
        }
        else{
            assert(x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}