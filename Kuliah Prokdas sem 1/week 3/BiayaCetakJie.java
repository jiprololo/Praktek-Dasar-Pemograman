import java.util.Scanner;

public class BiayaCetakJie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi konstanta harga
        int hargaPerLembar = 500;
        int biayaJilid = 5000;

        // Input jumlah lembar
        System.out.print("Masukkan jumlah lembar dokumen (x): ");
        int jumlahLembar = sc.nextInt();

        // Proses perhitungan
        int biayaCetak = jumlahLembar * hargaPerLembar;
        int totalBiaya = biayaCetak + biayaJilid;

        // Tampilkan hasil
        System.out.println("\n--- Rincian Biaya ---");
        System.out.println("Biaya cetak (" + jumlahLembar + " lembar) : Rp " + biayaCetak);
        System.out.println("Biaya penjilidan           : Rp " + biayaJilid);
        System.out.println("Total biaya yang dibayar   : Rp " + totalBiaya);
    }
}