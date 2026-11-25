//Nama: Ajie Satria Pamungkas/05
//NIM: 264107020070
//Kelas: TI-1D
import java.util.Scanner;
public class quiz2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nama = "Ajie Satria Pamungkas";
        int noAbsen = 7;
        int k = noAbsen % 5;
        System.out.println("Nama: " + nama);
        System.out.println("Kode Personal K = " + k);

        int jumlahKurir = k;
        int jumlahPaket = 0;
        double beratPaket = 0;
        double totalBerat = 0;
        double tarifPerpaket = 0;
        double biayaAdmin = k * 500;
        double biayaTotal = 0;

        for (int i = 1; i <= jumlahKurir; i++) {
            System.out.println("Kurir ke-" + i);
            for (int j = 1; j <= k; j++) {
                System.out.println("Paket ke-" + j);
            do {
                System.out.print("Berat paket: ");
                beratPaket = sc.nextDouble();
                if (beratPaket < 0) {
                    System.out.println("Error: berat paket harus >= 0");
                } else {
                    totalBerat += beratPaket;
                    jumlahPaket++;
                }
            } while (beratPaket < 0);

            double rataBerat = totalBerat / jumlahPaket;
            System.out.println("Rata-rata berat paket: " + rataBerat);
            
            if (beratPaket <= 1) {
                tarifPerpaket = 8000;
            } else if (beratPaket <= 10) {
                tarifPerpaket = 20000;
            } else {
                tarifPerpaket = 40000;
            }
    
        System.out.println("Jumlah kurir: " + jumlahKurir);
        System.out.println("berat paket: " + beratPaket);
        System.out.println("Jumlah paket: " + jumlahPaket);
        System.out.println("Tarif paket: " + tarifPerpaket);
        biayaTotal = (tarifPerpaket * jumlahPaket) + biayaAdmin;
        System.out.println("Biaya total: " + biayaTotal);        

        }
     
    }
     sc.close();
}
}