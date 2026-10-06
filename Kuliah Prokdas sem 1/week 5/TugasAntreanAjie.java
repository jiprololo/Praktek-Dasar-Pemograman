import java.util.Scanner;
public class TugasAntreanAjie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Antrean akademik ---");
        System.out.print("Masukan kode layanan: ");
        int layanan = sc.nextInt();

        switch (layanan) {
            case 1 :
                System.out.println("Legalisir ijazah - Loket A");
                break;
            case 2 :
                System.out.println("Surat keterangan aktif kuliah - Loket B");
                break;
            case 3 :
                System.out.println("Pembayaran UKT - Loket C");
                break;
            case 4 :
                System.out.println("Pengajuan cuti akademik - Loket D");
                break;
            default :
                System.out.println("Kode layanan tidak tersedia");
        }    

        sc.close();
    }
    
}
