package TestApp;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // membaut oprator menggunkan
        // perulangan dan percabangan

        System.out.println("Oprator MATEMATIKA\n");

        int nilai_satu,nilai_dua;
        boolean kondis = true;

        while (kondis){
            System.out.print("Masukan nilai Satu - : ");nilai_satu = input.nextInt();
            System.out.print("Masukan nilai Dua - : ");nilai_dua = input.nextInt();

            int hasil;
            char pilih_oprator;
            System.out.println( "== + - * / ==");
            System.out.print("Masukan Pilihan = ");pilih_oprator=input.next().charAt(0);
            switch (pilih_oprator){
                case '+' -> hasil = nilai_satu + nilai_dua;
                case '-' -> hasil = nilai_satu - nilai_dua;
                case '*' -> hasil = nilai_satu * nilai_dua;
                case '/' -> hasil = nilai_satu / nilai_dua;
                default -> hasil = 0;
             }
             if (pilih_oprator == '+' || pilih_oprator == '-' || pilih_oprator == '/' || pilih_oprator == '*'  ) {
                 System.out.println("Hasil dari : " + nilai_satu + " " + pilih_oprator + " " + nilai_dua + " = " + hasil);
             } else {
                 System.out.println("Oprator tidak ditemukan");
             }
            String kondis_satu;
            System.out.println();
            System.out.print("Lanjutkan Y/N : " );kondis_satu = input.next();
            if (kondis_satu.equalsIgnoreCase("Y")){
                kondis = true;
            } else if (kondis_satu.equalsIgnoreCase("N")){
                System.out.println("Terimak kasih telah berkunjung ");
                kondis = false;
            }
            System.out.println("");
        }

        }
        }
