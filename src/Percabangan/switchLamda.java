package Percabangan;

public class switchLamda {
    public static void main(String[] args) {

        char kondis = 'A';

        // cek kondis
        switch (kondis) {
            case 'A':
                System.out.println("Selamat anda lulus");
                break;
            case 'B':
            case 'C':
                System.out.println();break;
            case 'D':
                System.out.println("anda tidak lulus");
                break;
                // untuk kondis yang tidak bisa ditemukan
            default:
                System.out.println("Data anda tidak ditemukan");
        }

        System.out.println();
        String hasil;
        switch (kondis){
            case 'A','B','C' -> hasil = "Anda lulus";
            case 'D' -> hasil = "Anda tidak lulus";
            default -> hasil = "Data anda tidak ditemukan";
        }
        System.out.println(hasil+"\n");

        // bila meggunkan yield harus menambahkan deafault
        String hasil_satu = switch (kondis) {
            case 'A' :
                yield "Selamat anda lulus dengan baik";
            case 'B' :
                yield  "Selamat anda lulus";
            case 'C' :
                yield "Anda lulus";
            case 'D' :
                yield "anda tidak lulus";

            default : yield "data tidak ditemukan";
        };
        System.out.println(hasil_satu+"\n");

        // bila untuk mendapatan percabangan yang simpel
        int poin = 100;
        String hasil_dua = poin >= 70 ? "Selamat anda lulus " : "anda tidak lulus";
        System.out.println(hasil_dua);
    }
}
