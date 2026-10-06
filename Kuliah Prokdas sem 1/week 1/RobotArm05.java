public class RobotArm05 { 
    public static void main(String[] args) {
    

    // Kondisi awal
    String nampanA = "1 bola bintang";
    String nampanB = "1 bola bulan";
    String nampanC = "kosong";

    // Langkah 1: Ambil bola di nampan A, taruh di nampan C
    nampanC = nampanA;
    nampanA = "kosonng";

    System.out.println("Setelah Lankah 1: Nampan A = " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);

    // Langkah 2: Ambil bola di nampan B, taruh di nampan A
    nampanA = nampanB;
    nampanB = "kosong";

    System.out.println("Setelah Lankah 2: Nampan A = " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);

    // Langkah 3: Ambil bola di nampan C, taruh di nampan B
    nampanB = nampanC;
    nampanC = "kosong";

    System.out.println("Setelah Lankah 3: Nampan A = " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);

    // Kesimpulan
    System.out.println("Kesimpulan: pernyataan yang benar adalah (a) dan (e)." 
    + "Kedua bola sudah bertukar dan nampan C kosong");

}
}