import java.util.Scanner;

public class NilaiMahasiswa06 {

    static Scanner input = new Scanner(System.in);

    public static void isiArray(int[] kumpulanNilai) {
        System.out.println("Input Nilai Mahasiswa");
        for (int i = 0; i < kumpulanNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            kumpulanNilai[i] = input.nextInt();
        }
        System.out.println();
    }
    public static void tampilArray(int[] kumpulanNilai) {
        System.out.println("Daftar Nilai");
        for (int i = 0; i < kumpulanNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + kumpulanNilai[i]);
        }
    }

    // Menghitung total nilai
    public static int hitTot(int[] kumpulanNilai) {
        int hasilJumlah = 0;
        
        for (int i = 0; i < kumpulanNilai.length; i++) {
            hasilJumlah = hasilJumlah + kumpulanNilai[i];
        }
        
        return hasilJumlah;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = input.nextInt();
        int[] dataNilai = new int[n];

        isiArray(dataNilai);
        tampilArray(dataNilai);
        
        int total = hitTot(dataNilai);

        System.out.println("Total nilai keseluruhan: " + total);
    }
}