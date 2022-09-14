package Perulangan;

public class ForLoop {
    public static void main(String[] args) {

        // perulangan akan terjadi bila kondisnya terpenuhi (True)

        /*
        perulangan tanpa batas karna kodinya true
        for (;;){
            System.out.println("Perulangan tanpa batas - : ");
         */
        int value = 0;
        for (; value <= 10;) {
            System.out.println("nilai ke - " + value++
            );
        }
        System.out.println("");
        for (var i = 0; i <= 10; i ++) {
            System.out.println("Nilai ke - : " + i);
        }

        System.out.println("\nuntuk nilai array bisa menggukan array");
        int[] poin = {1,2,3,4,5};
        for (var i = 0; i<poin.length; i++) {
            System.out.println("nilai ke - " + poin[i]);
        }
    }
}
