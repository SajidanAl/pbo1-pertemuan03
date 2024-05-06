import java.util.Scanner;
import java.lang.Math;

public class Lingkaran {
    
    public static void main(String[] args) {
        Integer R, d;
        double luas, keliling, diameter;
    
        String user = "Sajidan";
        String pass = "12345";
        System.out.println("==================");
        System.out.println("Login");
        System.out.print("Username : ");
        Scanner inputlogin = new Scanner(System.in);
        String userinput = inputlogin.nextLine();
        System.out.print("Password : ");
        String passinput = inputlogin.nextLine();

        if (userinput.equals(user) && passinput.equals(pass)) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
            System.exit(0);
        }

        Scanner inputU = new Scanner(System.in);
        System.out.println("1. Menghitung Luas Lingkaran : ");
        System.out.println("2. Menghitung Keliling Lingkaran : ");
        System.out.println("3. Menghitung Diameter Lingkaran : ");
        System.out.print("Pilih Program : ");
        Integer inputu = inputU.nextInt();
        Scanner jarijari = new Scanner(System.in);

        switch (inputu) {
            case 1:               
                System.out.println("Program Menghitung Luas Lingkaran");
                System.out.print("Masukkan Nilai Jari Jari : ");
                R = jarijari.nextInt();

                luas = Math.PI * Math.pow(R,2);
                System.out.println("Luas : "+ luas);
            break;
            case 2:
                // Scanner jarijari = new Scanner(System.in);
                System.out.println("Program Menghitung Keliling Lingkaran");
                System.out.print("Masukkan Nilai Jari Jari : ");
                R = jarijari.nextInt();

                keliling = Math.PI * R * 2;
                System.out.println("Keliling : "+ keliling);
            break;
            case 3:
                // Scanner jarijari = new Scanner(System.in);
                System.out.println("Program Menghitung Diameter Lingkaran");
                System.out.print("Masukkan Nilai Jari Jari : ");
                R = jarijari.nextInt();

                diameter = R * 2;
                System.out.println("Diameter : "+ diameter);
            break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
            break;
        }
    }
}