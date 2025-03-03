package tugas1;

// PERCOBAAN 1 - Langsung di tampilkan melalui System.out.println
/*
public class Identitas{
    public static void main(String[] args) {
        System.out.println("NIM        : A11.2023.14880");
        System.out.println("NAMA       : Calvin Samuel Simbolon");
        System.out.println("Alamat     : Perum. Graha Mukti Residen No. 94");
        System.out.println("Kota       : Kota Semarang");
        System.out.println("Kode Pos   : 50195");
        System.out.println("Telp.      : -");
        System.out.println("Hp         : 081227426908");
        System.out.println("Email      : 111202314880@mhs.dinus.ac.id");

    }
}

*/


// PERCOBAAN 2 - Menyimpan identitas dengan variabel 
public class Identitas{
    public static void main(String[] args) {
        // Deklarasi dan assignment variabel
        String nim = "A11.2023.14880";
        String nama = "Calvin Samuel Simbolon";
        String alamat = "Perum. Graha Mukti Residen No. 94";
        String kota = "Kota Semarang";
        int kodepos = 50195;
        String telp = "-";
        String nohp = "081227426908";
        String email = "111202314880@mhs.dinus.ac.id";

        // print Output
        System.out.println("NIM        : "+ nim);
        System.out.println("NAMA       : "+ nama);
        System.out.println("Alamat     : "+ alamat);
        System.out.println("Kota       : "+ kota);
        System.out.println("Kode Pos   : "+ kodepos);
        System.out.println("Telp.      : "+ telp);
        System.out.println("Hp         : "+ nohp);
        System.out.println("Email      : "+ email);
    }
}
