package Percabangan;

public class ifStatement {
    public static void main(String[] args) {


        int nilai_satu = 90;
        int nilai_dua = 20;

        // bila kondisnya true maka blok ini akan dijalankan
        if (nilai_satu <= nilai_dua) {
            System.out.println("Blok satu akan dijalankan - 1\n");
        } else {
            // bila kondisinya salah makan blok ini yang akan di jalankan
            System.out.println("Blok yang salah akan dijalankan - 2\n");
        }

        // bila kondisi lebih dari satu
        if (nilai_satu >= 81){
            System.out.println("Selamat anda lulus dengan nilai diatas 81 - 100");
        } else if(nilai_satu >= 71 ){
            System.out.println("Selamat anda lulus dengan nilai diatas 71 - 80");
        } else  if (nilai_satu >= 60) {
            System.out.println("Selamat anda lulus dengan nilai diatas 60 - 70");
        } else {
            System.out.println("Maaf anda tidak lulus\n");
        }

        System.out.println();
        int rata_nilai_rapot = 90;
        int KKM = 75;
        String nilai = nilai_satu >= nilai_dua ? "selamat anda lulus" : "anda tidak lulus";
        System.out.println(nilai);
    }
}
