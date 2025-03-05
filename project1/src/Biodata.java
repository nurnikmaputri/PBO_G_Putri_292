import java.time.LocalDate;
import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        //Membuat objek scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        //Meminta input dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        //Menutup Scanner setelah digunakan
        scanner.close();

        //Mendapatkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear();

        //Menghitung umur
        int umur = tahunSekarang - tahunLahir;

        //Menentukan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        }else {
            jenisKelaminStr = "Tidak valid";
        }

        //Menampilkan output
        System.out.println("\nData Diri Pengguna: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");
    }
}
