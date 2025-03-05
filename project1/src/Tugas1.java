import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Looping menu hingga pengguna memilih keluar (pilihan == 3)
        do {
            System.out.println("\nPilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");

            while (!scanner.hasNextInt()) { // Cegah error jika input bukan angka
                System.out.println("Input harus berupa angka! Coba lagi.");
                scanner.next(); // Buang input yang salah
                System.out.print("Masukkan pilihan: ");
            }

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan 3 digit NIM terakhir: ");
                    String nimAkhir = scanner.nextLine();

                    String usernameBenar = "Admin" + nimAkhir;
                    String passwordBenar = "Password" + nimAkhir;

                    System.out.print("Masukkan username: ");
                    String username = scanner.nextLine();

                    System.out.print("Masukkan password: ");
                    String password = scanner.nextLine();

                    if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                        System.out.println("Login Admin berhasil!");
                    } else {
                        System.out.println("Login gagal! Username atau password salah.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();

                    if (nama.equals("Putri Nurnikma") && nim.equals("202410370110292")) {
                        System.out.println("Login Mahasiswa berhasil!");
                        System.out.println("Nama: " + nama);
                        System.out.println("NIM: " + nim);
                    } else {
                        System.out.println("Login gagal! Nama atau NIM salah.");
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 3); // Loop akan berhenti jika pilihan == 3

        scanner.close();
    }
}
