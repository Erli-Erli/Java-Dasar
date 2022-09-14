package TipeDataCharacter;

public class TipeVar {
    public static void main(String[] args) {

        // update java 10 bisa menggukan var
        // bila ingin menggukan tipe data var harus lasung dibuat menginisiasi
        // final kata kunci final bisa digunkan untuk data yang sudah tidak bisa diubah" lagi


        var name = "Erli Saputra";
        var age = 22;
        var address = "Parittiga Jebus";
        var ip = 2.299D;

        System.out.println("Nama saya : " + name);
        System.out.println("Umur : " + age);
        System.out.println("Alamat : " + address);
        System.out.println("Ip : " + ip + "\n");

        System.out.println("Menggunkan kata kunci final");
        final var nilai_rapot = 90;
        final double harga = 1.000;

        System.out.println(nilai_rapot);
        System.out.println(harga);

    }
}
