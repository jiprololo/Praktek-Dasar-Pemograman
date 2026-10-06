import java.util.Scanner;

public class ModifikasiStudiKasus1Ajie
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Masukkan Tunjangan Anak per Bulan: ");
        double tunjanganPerAnak = sc.nextDouble();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = sc.nextInt();

        double totalTunjangan = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * 0.10;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji Bersih yang Diterima: Rp " + gajiBersih);
    }
}