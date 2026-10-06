import java.util.Scanner;

 //Nama : Ajie Satria Pamungkas
 //NIM  : 264107020070
 //Kelas: TI-1D
 //Tugas: Kuis PrakDaspro
public class AjieSatriaPkuis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        double komisiPerusahaan = 0.03;
        double resikoKeterlambatan = 0.05;
        double resikoKerusakanBarang = 0.08;

        //input data
        System.out.print("tarif dasar:(x) Rp ");
        double tarifDasar = sc.nextDouble();

        System.out.print("harga jual makanan (k): Rp ");
        double hargaJualMakanan = sc.nextDouble();

        System.out.print("biaya makanan (t): Rp ");
        double biayaMakanan = sc.nextDouble();

        System.out.print("biaya bahan bakar (y): Rp ");
        double biayaBahanBakar = sc.nextDouble();

        System.out.print("jarak perjalanan (z): Km ");
        int jarakPerjalanan = sc.nextInt();

        System.out.print("jumlah transaksi (a): Transaksi ");
        int jumlahTransaksi = sc.nextInt();
        
    //proses perhitungan keuntungan driver dan merchant
    double tarifDasarTotal = (tarifDasar * jarakPerjalanan);
    double biayaBahanBakarTotal = (biayaBahanBakar * jarakPerjalanan);
    double totalBiayaDriver = (tarifDasarTotal - biayaBahanBakarTotal);
    double totalBiayaMerchant = (hargaJualMakanan - biayaMakanan);
    double keuntunganDriver = (totalBiayaDriver * komisiPerusahaan * resikoKeterlambatan) * jumlahTransaksi;
    double keuntunganMerchant = (totalBiayaMerchant * komisiPerusahaan * resikoKerusakanBarang) * jumlahTransaksi;

    //proses perhitungan keuntungan mitra
    double totalKeuntunganMitra = (keuntunganDriver + keuntunganMerchant); //total keuntungan mitra
    double ratarataSemuaTransaksi = (totalKeuntunganMitra / jumlahTransaksi); //rata-rata semua transaksi
    double persentaseMasingMitra = (totalKeuntunganMitra / ratarataSemuaTransaksi) * 100; //persentase masing-masing mitra

    //tampilkan hasil
    System.out.println("Total tarif dasar: Rp " + tarifDasarTotal);
    System.out.println("Total biaya bahan bakar: Rp " + biayaBahanBakarTotal);
    System.out.println("Total biaya perjalanan: Rp " + totalBiayaDriver);
    System.out.println("Total biaya merchant: Rp " + totalBiayaMerchant);
    System.out.println("Keuntungan driver: Rp " + keuntunganDriver);
    System.out.println("Keuntungan merchant: Rp " + keuntunganMerchant);
    
    System.out.println("Total keuntungan mitra: Rp " + totalKeuntunganMitra);
    System.out.println("Rata-rata keuntungan per transaksi: Rp " + ratarataSemuaTransaksi);
    System.out.println("Persentase keuntungan masing-masing mitra: " + persentaseMasingMitra + "%");
    sc.close();
    }
}