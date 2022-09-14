package ConverteNilai;

public class ConverterApp {
    public static void main(String[] args) {


        // converter Otomatis
        // converter nilai otomatis dari kecil ke besar

        System.out.println("Conveter nilai Otomatis");
        byte iniByte = 10;
        short iniShort = iniByte;

        int iniInteger = 20;
        long iniLong = iniInteger;

        System.out.println("Conveter nilai byte ke Short : " + iniShort);
        System.out.println("Conveter nilai Int ke Long : " + iniLong + "\n");

        System.out.println("Converter Nilai Manual");

        // conveter manual dari nilai kecil ke besar
        double iniDouble = 10D;
        int iniInteger_Satu = (int) iniDouble;

        float iniFloate = 10f;
        short iniShort_Satu = (short) iniFloate;

        System.out.println("Converter manual Dari Double ke Integer : " + iniInteger_Satu);
        System.out.println("Converter manual Dari Short ke Float : " + iniShort_Satu );
    }
}
