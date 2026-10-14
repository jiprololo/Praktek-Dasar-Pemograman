import java.util.Scanner;
public class StudiKasus103 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18_000;
        int jumlahCup;
        int totalHarga;
        int diskon;
        int totalBayar;
        int uangBayar;
        int kembalian;
        int kurangBayar;

        System.out.println("\n=== KEDAI KOPI SENJA ===");
        System.out.println("masukkan jumlah cup kopi yang ingin dibeli: ");
        jumlahCup = sc.nextInt();
        //System.out.println("masukan uang yang dibayarkan: Rp ");
        //uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 100_000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.println("Harga per cup\t\t : Rp " + hargaPerCup);
        System.out.println("Jumlah cup\t\t : " + jumlahCup);
        System.out.println("Total harga\t\t : Rp " + totalHarga);
        System.out.println("Total diskon\t\t : Rp " + diskon);
        System.out.println("Total yang dibayar\t : Rp " + totalBayar);

        System.out.println("Masukkan uang yang dibayarkan: Rp ");
        uangBayar = sc.nextInt();

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t\t : Rp " + kembalian);
        } else {
            kurangBayar = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang\t : Rp " + kurangBayar);
        }
        System.out.println("\n=== Terima kasih telah berbelanja di Kedai Kopi Senja! ===\n");
        sc.close();
    }
}