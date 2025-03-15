package tugasmodul2;


public class Mahasiswa {
    String nama = "Putri Nurnikma";
    long nim = 202410370110292L;

    void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    void login(String namaInput, long nimInput){
        if ((namaInput.equalsIgnoreCase(nama)) && (nimInput == nim)){
            System.out.println("login berhasil");
            displayInfo();
        } else {
            System.out.println("login mahasiswa gagal. nama atau nim salah");
        }
    }
}
