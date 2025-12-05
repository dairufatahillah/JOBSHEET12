import java.util.Scanner;

public class Kubus06 {

    // Fungsi untuk menghitung Luas Permukaan
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi);
    }

    // Fungsi untuk menghitung Volume
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        
        int s = input.nextInt();

        int luas = hitungLuasPermukaan(s);
        int volume = hitungVolume(s);

        System.out.println("Luas Permukaan : " + luas);
        System.out.println("Volume Kubus   : " + volume);
    }
}