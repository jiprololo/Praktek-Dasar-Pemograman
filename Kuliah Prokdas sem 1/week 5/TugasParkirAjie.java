import java.util.Scanner;
public class TugasParkirAjie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan lama Parkir ");
        int lamaJam = sc.nextInt();
        int tarif;

        if (lamaJam <= 2) {
            tarif = 2000;
        } else {
            int jamTambahan = lamaJam - 2;
            tarif = 2000 + (jamTambahan * 1000);
        }

        System.out.println("lama parkir" + lamaJam + "jam");
        System.out.println("Tarif parkir = Rp " + tarif);

        sc.close();

    }
    
}
