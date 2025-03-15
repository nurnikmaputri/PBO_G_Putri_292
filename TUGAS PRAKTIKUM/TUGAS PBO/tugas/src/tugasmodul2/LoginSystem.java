package tugasmodul2;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args){
        Scanner objInput = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Pilih Login:");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.print("Masukan pilihan: ");
        int pilihan = objInput.nextInt();
        objInput.nextLine();

        switch (pilihan){
            case 1:
                System.out.print("Masukan username: ");
                String usernameInput = objInput.nextLine();
                System.out.print("Masukan password: ");
                String passwordInput = objInput.nextLine();
                admin.login(usernameInput, passwordInput);
                break;

            case 2:
                System.out.print("Masukan nama: ");
                String namaInput = objInput.nextLine();
                System.out.print("Masukan nim: ");
                long nimInput = objInput.nextLong();
                mahasiswa.login(namaInput, nimInput);
                break;

            default:
                System.out.println("pilihan tidak valid");
        }

    }
}