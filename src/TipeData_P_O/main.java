package TipeData_P_O;

public class main {
    public static void main(String[] args) {

        // tipe data primitif default value 0;
        byte iniByte = 10;
        short iniShort = 20;
        int iniInt = 30;

        // tipe data object
        // bila tipe data object memiliki default value null

        Byte iniByte_satu = 10;
        Short iniShort_satu = 20;
        Integer iniInteger = 100000;

        // cara mengconveter
        Integer iniInteger_satu = iniByte_satu.intValue();
        Integer iniInteger_Dua = (int) iniShort;

        System.out.println("Conventer Nilai Object : " + iniInteger_satu );
        System.out.println("Conveter nilai : " + iniInteger_Dua);
    }
}
