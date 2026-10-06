import java.util.Scanner;

public class KreditLaptopJie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan harga laptop (x): Rp ");
        double hargaLaptop = sc.nextDouble();

        System.out.print("Masukkan uang muka (y): Rp ");
        double uangMuka = sc.nextDouble();

        System.out.print("Masukkan lama cicilan dalam bulan (z): ");
        int lamaCicilan = sc.nextInt();

        // Proses perhitungan
        double sisaHarga = hargaLaptop - uangMuka;
        double cicilanPokok = sisaHarga / lamaCicilan;
        double bunga = 0.02 * sisaHarga; // Bunga tetap 2% dari sisa harga
        double cicilanPerBulan = cicilanPokok + bunga;

        // Tampilkan hasil
        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("Sisa harga laptop        : Rp " + sisaHarga);
        System.out.println("Bunga per bulan (2%)     : Rp " + bunga);
        System.out.println("Jumlah cicilan per bulan : Rp " + cicilanPerBulan);
    }
}