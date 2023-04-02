/**
 * File : Asersi2.java 02/04/2023
 * Penulis : Muhammad Abdul Aziz
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 * jari jari lingkaran bernilai nol
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main (String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * JAWAB : Pada baris assert(jariJari>0):"jari jari tidak boleh nol!!!";, terdapat kondisi yang mengharuskan nilai
 * jariJari lebih besar dari 0. Namun, pada saat program dijalankan, nilai jariJari diinisialisasi dengan nilai 0.
 * Kondisi ini tidak terpenuhi, sehingga assertion akan gagal dan program akan menghasilkan pesan error.
 * Selain itu, assertion tidak akan bekerja jika opsi -ea (enable assertions) tidak diaktifkan pada saat menjalankan
 * program. Oleh karena itu, perlu memastikan opsi tersebut diaktifkan pada saat menjalankan program.
 * Sebaiknya, dalam penggunaan assertion, kondisi yang diberikan haruslah memeriksa sesuai dengan tujuan penggunaan
 * assertion tersebut. Selain itu, sebaiknya menghindari penggunaan assertion untuk memeriksa kondisi yang dapat dicek
 * dengan kondisi if-else pada program, karena assertion lebih cocok digunakan untuk memeriksa kondisi yang tidak boleh
 * terjadi dan menjadi tanda adanya kesalahan pada program.
 */