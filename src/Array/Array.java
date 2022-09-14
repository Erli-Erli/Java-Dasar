package Array;

public class Array {
    public static void main(String[] args) {

        // cara membuat array ada beberapa cara
        //
        String[] name = new String[3];
        name[0] = "Erli";
        name[1] = "Saputra";
        name[2] = "Pratama";

        // untuk mengubah isi array
        //name[2] = "Biass";
        //name[2] = null;

        // cara mengeprin
        System.out.println(name[0] + " " + name[1] + " " + name[2]);
        // cara mengprin menggunkan perulangan
        for (var username : name){
            System.out.print(username);
            System.out.print(" ");
        }

        // cara mengprin Initializer
        long[] value = {1,2,3,4,5};
        System.out.println();
        System.out.println();

        System.out.println(value[1]);
        // mengprin menggukan perulangan
        for (var panjang : value){
            System.out.print(panjang);
        }
        // mengprin dengan menukur panjang array
        // cara mengukur panjang array length
        System.out.println("");
        for (var i = 0; i<value.length; i++){
            System.out.print(i);
        }
    }
}
