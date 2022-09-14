package Metod;

public class main {
    public static void main(String[] args) {

        int nilai_satu, nilai_dua;
        nilai_satu = 10;
        nilai_dua = 20;
        System.out.println("hasil Penjumlahan : " + jumlah(nilai_satu,nilai_dua));

        Null();
        main("Erli");
    }
    // cara membuat method
    static void Null(){
        System.out.println("Data Kosong");
    }
    // menggukan prameter
    static void main (String nama ){
        System.out.println("Halo Perkenalan nama saya : " + nama);
    }
    // method yang bisa mengembalikan nilai
    // harus menggukan kata return
    static int jumlah(int nilai_satu, int nilai_dua){
        var nilai = nilai_satu + nilai_dua;
        return nilai;
    }
}
