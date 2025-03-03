package tugas2;
import java.util.Scanner;


public class Luas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;


        System.out.println("Welcome,,,,");
        System.out.println("Selamat datang di program menghitung luas dan keliling");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kubus");

        System.out.println("Pilih bangun yang ingin anda hitung luasnya : ");
        pilihan = input.nextInt();


        switch (pilihan){
            case 1:
                HitungPersegi(input);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Pilihan anda tidak ada!");
        }

        input.close();
    }

    // Method hitung persegi
    public static void HitungPersegi(Scanner input) {
        System.out.println("Masukkan panjang sisi : ");
        double sisi = input.nextDouble();

        // proses rumus luas dan keliling
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas persegi adalah "+ luas);
        System.out.println("Keliling persegi adalah "+ keliling);
    }

}