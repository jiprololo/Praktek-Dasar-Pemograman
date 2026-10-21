// Nama: Ajie Satria Pamungkas
// NIM: 264107020070
// Kelas: TI-1D

import java.util.Scanner;
public class utsAjieSatria1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Input Senjata yang digunakan
        System.out.print("Daftar Senjata Yang di Pakai: ");
        System.out.println("1. AR");
        System.out.println("2. SMG");
        System.out.println("3. Sniper");
        System.out.print("Masukkan Pilihan Senjata (1/2/3): ");
        int pilihanSenjata = sc.nextInt();
        
        // Input Bagian Tembakan
        System.out.print("Masukkan Bagian Tembakan: ");
        System.out.println("1. Kepala");
        System.out.println("2. Badan");
        System.out.print("Masukkan Pilihan Bagian Tembakan (1/2): ");
        int bagianTembakan = sc.nextInt();

        //damage dasar senjata
        int damageARKepala = 60;
        int damageARBadan = 35;
        int damageSMGKepala = 45;
        int damageSMGBadan = 25;
        int damageSniperKepala = 100; // Sniper headshot akan langsung mengalahkan musuh
        int damageSniperBadan = 90;

        //Asumsi musuh memakai rompi level 2
        System.out.println("Musuh Memakai Rompi Lv 2");
        double penguranganDamageAR = 0.2; // Jika mengenai badan musuh
        double penguranganDamageSMG = 0.3; // Mengenai seluruh badan musuh
        double damageFinal = 0;
        String damageAkhir = "";
        boolean valid = true;

        //Switch case untuk menentukan damage berdasarkan senjata dan bagian tembakan
        switch (pilihanSenjata) {
            case 1: // AR
                if (bagianTembakan == 1) { // Kepala
                    damageFinal = damageARKepala;
                    damageAkhir = String.valueOf(damageFinal);
                    System.out.println("Damage yang diberikan: " + damageARKepala);
                } else if (bagianTembakan == 2) { // Badan
                    damageFinal = damageARBadan - (damageARBadan * penguranganDamageAR);
                    damageAkhir = String.valueOf(damageFinal);
                    System.out.println("Damage yang diberikan: " + damageFinal);
                } else {
                    valid = false;
                }
                break;
            case 2: // SMG
                if (bagianTembakan == 1) { // Kepala
                    damageFinal = damageSMGKepala * penguranganDamageSMG;
                    damageAkhir = String.valueOf(damageFinal);
                    System.out.println("Damage yang diberikan: " + damageSMGKepala);
                } else if (bagianTembakan == 2) { // Badan
                    damageFinal = damageSMGBadan * penguranganDamageSMG;
                    damageAkhir = String.valueOf(damageFinal);
                    System.out.println("Damage yang diberikan: " + damageFinal);
                } else {
                    valid = false;
                }
                break;
            case 3: // Sniper
                if (bagianTembakan == 1) { // Kepala
                    damageFinal = damageSniperKepala;
                    damageAkhir = "HEADSHOT!! Knock Out";
                    System.out.println("Damage yang diberikan: " + damageAkhir);
                } else if (bagianTembakan == 2) { // Badan
                    damageFinal = damageSniperBadan;
                    damageAkhir = String.valueOf(damageFinal);
                    System.out.println("Damage yang diberikan: " + damageFinal);
                } else {
                    valid = false;
                }
                break;
            default:
                System.out.println("Pilihan senjata tidak valid.");
        }

        if (valid) {
            System.out.println("----- Hasil Tembakan ---");
            System.out.println("Senjata yang digunakan: " + (pilihanSenjata == 1 ? "AR" : pilihanSenjata == 2 ? "SMG" : "Sniper"));
            System.out.println("Bagian tembakan: " + (bagianTembakan == 1 ? "Kepala" : "Badan"));
            System.out.println("Pengurangan damage karena rompi: " + (pilihanSenjata == 1 ? penguranganDamageAR : pilihanSenjata == 2 ? penguranganDamageSMG : "Tidak ada"));
            System.out.println("Damage dasar: " + (pilihanSenjata == 1 ? (bagianTembakan == 1 ? damageARKepala : damageARBadan) : pilihanSenjata == 2 ? (bagianTembakan == 1 ? damageSMGKepala : damageSMGBadan) : (bagianTembakan == 1 ? damageSniperKepala : damageSniperBadan)));
            System.out.println("Damage akhir yang diberikan: " + damageAkhir);
        }
        sc.close();
    }
}