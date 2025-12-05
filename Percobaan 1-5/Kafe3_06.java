import java.util.Scanner;

public class Kafe3_06 {
    public static void menu() {

        System.out.println("=== Menu Kafe ===");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=====================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");

    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String promo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        if (promo.equalsIgnoreCase("Diskon50")) {
            int diskon = hargaTotal * 50 / 100;
            hargaTotal -= diskon;
            System.out.println("Promo berlaku: Diskon 50% dengan Potongan Rp " + diskon);
        } else if (promo.equalsIgnoreCase("Diskon30")) {
            int diskon = hargaTotal * 30 / 100;
            hargaTotal -= diskon;
            System.out.println("Promo berlaku: Diskon 30% dengan Potongan Rp " + diskon);
        } else {
            System.out.println("Promo tidak valid");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        menu();

        Scanner sc = new Scanner(System.in);

        int total = 0;
        String next;

        do {
            System.out.print("\n Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            String abc = sc.nextLine();
            System.out.print("Masukkan jumlah Diskon yang di terima: ");
            String promo = sc.nextLine();

            int totalHarga = hitungTotalHarga( pilihanMenu, banyakItem, promo);

            System.out.println("Total Harga untuk pesanan Anda: Rp" + totalHarga);

            System.out.print("Apakah anda ingin menambah menu? (ya/tidak)");
            next = sc.nextLine();

            total += totalHarga;

        } while (next.equalsIgnoreCase("ya"));
        System.out.println("\total pesanan sekitar : Rp " + total);
    }
}