package tugasmodul2;

public class Admin {
    String username = "Admin292";
    String password = "password292";

    void login(String userInput, String passInput) {
        if ((userInput.equals(username)) && (passInput.equals(password))){
            System.out.println("Login admin berhasil");
        } else {
            System.out.println("login admin gagal, username atau nim salah");
        }
    }
}