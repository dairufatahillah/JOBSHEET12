import java.util.Scanner;

public class RekapPenjualanCafe06 {

    static Scanner input = new Scanner(System.in);

    public static void inputDataPenjualan(String[] namaMenu, int[][] dataJual) {
        for (int m = 0; m < namaMenu.length; m++) {
            System.out.println("Input Data Menu ke-" + (m + 1) + " ---");
            
            input.nextLine(); 
            
            System.out.print("Masukkan Nama Menu: ");
            namaMenu[m] = input.nextLine();

            for (int h = 0; h < dataJual[m].length; h++) {
                System.out.print("Penjualan Hari ke-" + (h + 1) + ": ");
                dataJual[m][h] = input.nextInt();
            }
        }
    }

    public static void tampilkanTabel(String[] namaMenu, int[][] dataJual) {
        System.out.println("\nRekap Data Penjualan");
        
        System.out.print("Menu\t\t");
        for (int h = 0; h < dataJual[0].length; h++) {
            System.out.print("H-" + (h + 1) + "\t");
        }
        System.out.println();
        for (int m = 0; m < namaMenu.length; m++) {
            System.out.print(namaMenu[m] + "\t\t");
            for (int h = 0; h < dataJual[m].length; h++) {
                System.out.print(dataJual[m][h] + "\t");
            }
            System.out.println();
        }
    }
    public static int cariMenuTerlaris(int[][] dataJual) {
        int maxPenjualan = 0;
        int indexTerbaik = -1;

        for (int m = 0; m < dataJual.length; m++) {
            int totalPerMenu = 0;
            for (int h = 0; h < dataJual[m].length; h++) {
                totalPerMenu += dataJual[m][h];
            }
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                indexTerbaik = m;
            }
        }
        return indexTerbaik;
    }

    public static int hitungTotalPerMenu(int[] dataSatuMenu) {
        int total = 0;
        for (int val : dataSatuMenu) {
            total += val;
        }
        return total;
    }

    // 4. Fungsi Menghitung Rata-rata
    public static void tampilkanRataRata(String[] namaMenu, int[][] dataJual) {
        System.out.println("\nRata-rata Penjualan");
        for (int m = 0; m < dataJual.length; m++) {
            double total = 0;
            for (int h = 0; h < dataJual[m].length; h++) {
                total += dataJual[m][h];
            }
            double rataRata = total / dataJual[m].length;
            
            System.out.printf("- %s : %.1f\n", namaMenu[m], rataRata);
        }
    }

    // Main Method (Menggabungkan soal 3a dan 3b)
    public static void main(String[] args) {
        System.out.println("Input Penjualan Cafe");
        System.out.print("Masukkan jumlah menu yang dijual: ");
        int jumlahMenu = input.nextInt();
        
        System.out.print("Masukkan jumlah hari pencatatan: ");
        int jumlahHari = input.nextInt();

        String[] daftarMenu = new String[jumlahMenu];
        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];

        inputDataPenjualan(daftarMenu, dataPenjualan);
        tampilkanTabel(daftarMenu, dataPenjualan);

        // Menu yang terlaris
        int indexBest = cariMenuTerlaris(dataPenjualan);
        int totalBest = hitungTotalPerMenu(dataPenjualan[indexBest]);

        System.out.println("Menu dengan penjualan TERTINGGI: " + daftarMenu[indexBest]);
        System.out.println("Total Penjualan: " + totalBest);

        tampilkanRataRata(daftarMenu, dataPenjualan);
    }
}