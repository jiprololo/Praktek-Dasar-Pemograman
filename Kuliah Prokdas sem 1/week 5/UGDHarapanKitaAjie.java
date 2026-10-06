import java.util.Scanner;

public class UGDHarapanKitaAjie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- UGD RS Harapan Kita ---");

        System.out.print("Saturasi oksigen / SpO2 (%): ");
        double spo2 = sc.nextDouble();

        System.out.print("Sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();

        System.out.print("Tekanan darah sistolik (mmHg): ");
        int sistolik = sc.nextInt();

        System.out.print("Pasien dalam kondisi sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();

        System.out.print("Suhu tubuh (C): ");
        double suhuTubuh = sc.nextDouble();

        System.out.print("Punya riwayat penyakit komorbid? (true/false): ");
        boolean riwayatKomorbid = sc.nextBoolean();

        System.out.print("Usia (tahun): ");
        int usia = sc.nextInt();

        System.out.print("Laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        String ruang;

        if (spo2 < 85 && sisaBedICU > 0) {
            ruang = "ICU";
        } else if (spo2 < 85 && sisaBedICU == 0) {
            ruang = "UGD_VENTILATOR_MOBIL";
        } else if ((spo2 >= 85 && spo2 <= 89)
                || (sistolik < 90 || sistolik > 180)
                || !sadarPenuh) {
            ruang = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || suhuTubuh > 39)
                && riwayatKomorbid
                && usia >= 65) {
            ruang = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            ruang = "RAWAT_INAP_UMUM";
        } else {
            ruang = "RAWAT_JALAN";
        }

        System.out.println("Ruang perawatan: " + ruang);

        sc.close();
    }
}
