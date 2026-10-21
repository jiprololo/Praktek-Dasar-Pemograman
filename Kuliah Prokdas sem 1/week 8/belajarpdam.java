import java.util.Scanner;

public class belajarpdam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Golongan Pelanggan:");
        System.out.println("1. Rumah Tangga");
        System.out.println("2. Niaga");
        System.out.print("Masukkan pilihan golongan (1/2): ");
        int golongan = input.nextInt();

        System.out.print("Masukkan jumlah pemakaian air (m3): ");
        int pemakaian = input.nextInt();

        int tarifPerKubik = 0;
        int totalTagihan = 0;
        boolean valid = true;

        // Switch case untuk mengecek golongan
        switch (golongan) {
            case 1:
                // Nested if di dalam switch case
                if (pemakaian >= 0) {
                    if (pemakaian <= 10) {
                        tarifPerKubik = 2000;
                    } else {
                        tarifPerKubik = 3000;
                    }
                } else {
                    System.out.println("Pemakaian tidak valid!");
                    valid = false;
                }
                break;

            case 2:
                // Nested if di dalam switch case
                if (pemakaian >= 0) {
                    if (pemakaian <= 10) {
                        tarifPerKubik = 4000;
                    } else {
                        tarifPerKubik = 5000;
                    }
                } else {
                    System.out.println("Pemakaian tidak valid!");
                    valid = false;
                }
                break;

            default:
                System.out.println("Golongan tidak terdaftar!");
                valid = false;
                break;
        }

        if (valid) {
            totalTagihan = pemakaian * tarifPerKubik;
            System.out.println("--- Rincian Tagihan PDAM ---");
            System.out.println("Golongan: " + golongan);
            System.out.println("Pemakaian: " + pemakaian + " m3");
            System.out.println("Tarif per m3: Rp " + tarifPerKubik);
            System.out.println("Total Tagihan: Rp " + totalTagihan);
        }

        input.close();
    }
}