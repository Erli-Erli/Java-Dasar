package OpratorMatika;

public class OpratorMatika {
    public static void main(String[] args) {

        int int_Satu = 1;
        int int_Dua = 2;
        int int_Tiga = 3;

        long long_Satu = 5;
        long long_Dua = 10;
        long long_Tiga = 20;

        byte iniByte = 10 / 2;
        double iniDouble = 10 * 2;
        long tambah = int_Satu + long_Satu;
        long kurang = int_Dua - long_Dua;

        System.out.println("Penjumlahan + : " + tambah);
        System.out.println("Pengurangan - : " + kurang);
        System.out.println("Perkalian * : " + iniDouble);
        System.out.println("Pembagina / : " + iniByte);
    }
}
