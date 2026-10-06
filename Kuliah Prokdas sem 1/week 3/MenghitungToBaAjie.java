import java.util.Scanner;

public class MenghitungToBaAjie {
    public static void main(String[] args) {
        // Deklarasi Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Deklarasi variabel
            int harga;
            double potongan;
            double jml_bayar;
            double diskon = 0.15;

        // Input harga
        System.out.print("Masukkan harga: ");
        harga = sc.nextInt();

            // Menghitung potongan dan jumlah bayar
            potongan = diskon * harga;
            jml_bayar = harga - potongan;

            // Tampilkan hasil
            System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
        }
    }
}