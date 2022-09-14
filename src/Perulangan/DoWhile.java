package Perulangan;

public class DoWhile {
    public static void main(String[] args) {

        // doWhile perulangan yang akan di ulang walau hanya satu kali
        var i = 0;
        do {
            System.out.println("Nilai ke - : " + i++ );
        }while (i < 10);

        System.out.println();
        // perulangan juga bisa menggunkan break dan contiune
        var b = 0;
        while (true) {
            System.out.println("Data yang masuke ke - : " + b++ );
            // gukan break untuk menghentikan
            if (b > 10) {
                break;
            }
        }

        System.out.println();
        // for each
        String[]nama = {"Erli","Adi","Umi Maysaroh"};
        for (var d : nama) {
            System.out.print(d);
            System.out.print(" ");
        }
    }}
