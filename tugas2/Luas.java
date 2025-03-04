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
                HitungSegitiga(input);
                break;
            case 3:
                HitungLingkaran(input);
                break;
            case 4:
                HitungKubus(input);
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

    // METHOD Hitung Segitiga
    public static void HitungSegitiga (Scanner input) {
        // INPUT
        System.out.println("Masukkan tinggi segitiga");
        double tinggi = input.nextDouble();
        System.out.println("Masukkan alas segitiga");
        double alas = input.nextDouble();
        
        System.out.println("Masukkan sisi1 segitiga");
        double sisi1 = input.nextDouble();
        System.out.println("Masukkan sisi2 segitiga");
        double sisi2 = input.nextDouble();
        System.out.println("Masukkan sisi3 segitiga");
        double sisi3 = input.nextDouble();

        // PROCCESS
        double luas = (alas * tinggi) / 2;
        double keliling = sisi1 + sisi2 + sisi3;

        // OUTPUT
        System.out.println("Luas segitiga adalah "+ luas);
        System.out.println("Keliling segitiga adalah "+ keliling);
    }

    // Method hitung Lingkaran
    public static void HitungLingkaran(Scanner input) {
        // INPUT
        System.out.println("Masukkan jari - jari lingkaran");
        double jari = input.nextDouble();

        // DEKLARASI KONSTANTA
        double phi = 3.14;
        // PROCESS 
        double luas = phi * jari * jari;
        double keliling = 2 * jari * phi;

        // OUTPUT
        System.out.println("Luas lingkaran adalah "+ luas);
        System.out.println("Keliling lingkaran adalah "+ keliling);
    }

    // METHOD HITUNG KUBUS
    public static void HitungKubus(Scanner input) {
        // INPUT
        System.out.println("Masukkan Sisi");
        double sisi = input.nextDouble();

        // PROCCESS
        double volume = sisi * sisi * sisi;
        double permukaan = 6 * (sisi * sisi);

        // OUTPUT
        System.out.println("Volume kubus adalah " + volume);
        System.out.println("Permukaan kubus adalah " + permukaan); 

    }
}