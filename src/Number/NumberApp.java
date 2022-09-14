package Number;

public class NumberApp {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = 1000;
        int iniInteger = 100000;
        long iniLong = 1000000000;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);
        System.out.println(iniLong+"\n");

        // Floating Point

        System.out.println("menggukan Floating poin");
        float iniFloat =  1.0F; // gunkan huruf F dibelakang bila ingin menggukan titik
        double iniDouble = 2D;
        System.out.println(iniDouble);
        System.out.println(iniFloat+ "\n");

        System.out.println("Menggukan  Literals");
        int decimal = 25;
        int hexdecimal = 0X1F;
        int binary = 0B0101010;

        System.out.println(decimal);
        System.out.println(hexdecimal);
        System.out.println(binary+"\n");

        // underscor
        System.out.println("Menggnukan underScor");
        long RP = 60_000_000;
        int sum = 1_000;

        System.out.println(RP);
        System.out.println(sum);

    }
}
