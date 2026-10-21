import java.util.Scanner;

public class diskonbelanjaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda member? (ya/tidak): ");
        String statusMember = input.nextLine();

        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        // Nested if (If di dalam If)
        if (statusMember.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 0.20; // 20%
            } else if (totalBelanja > 100000) {
                diskon = 0.10; // 10%
            } else {
                diskon = 0.0;
            }
        } else {
            if (totalBelanja > 500000) {
                diskon = 0.05; // 5%
            } else {
                diskon = 0.0;
            }
        }

        double potonganHarga = totalBelanja * diskon;
        double totalBayar = totalBelanja - potonganHarga;

        System.out.println("--- Struk Pembayaran ---");
        System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
        System.out.println("Potongan harga: Rp " + potonganHarga);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        input.close();
    }
}