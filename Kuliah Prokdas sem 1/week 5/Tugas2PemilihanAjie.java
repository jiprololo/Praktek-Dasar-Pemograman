import java.util.Scanner;
public class Tugas2PemilihanAjie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Massukan jumlah SKS");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        sc.close();
    
    }
}
