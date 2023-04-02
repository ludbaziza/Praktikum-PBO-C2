/**
 * File : AngkaSial.java 02/04/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : Program penggunaan exception buatan sendiri
 * pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial ");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka !!!");
        }
    }
}

/**
 * PERTANYAAN:
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 *
 * JAWAB :
 * Jika sebuah eksepsi terjadi pada baris if(angka == 13) dan eksepsi tersebut dilemparkan dengan throw new
 * AngkaSialException(), maka baris System.out.println(angka + " bukan angka sial "); pada blok try-catch tidak akan
 * dieksekusi. Sebaliknya, program akan langsung melompat ke blok catch untuk menangani eksepsi yang terjadi.
 *
 * Baris 21 pada AngkaSial.java akan dieksekusi, karena program akan melanjutkan eksekusi
 * setelah blok catch selesai dieksekusi.
 */
