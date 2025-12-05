import java.util.Scanner;

public class HitungBalok06 {
    static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int Tinggi, int a, int b){
        int Volume = hitungLuas(a, b) * Tinggi;
        return Volume;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.println("Masukan Panjang");
        p = input.nextInt();
        
        System.out.println("Masukan Lebar");
        l = input.nextInt();

        System.out.println("Masukan Tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah "+ L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume Balok adalah "+ vol);

        input.close();
    }
}
