import java.util.Scanner;

public class GajiKaryawanAjie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long gajiPokok;
        double bonus;
        long totGaji; // Tipe data diubah menjadi long
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;
        
        // Menggunakan type casting (int) agar hasil perhitungan menjadi bilangan bulat
        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok));

        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);
    }
}