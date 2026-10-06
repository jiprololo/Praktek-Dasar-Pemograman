import java.util.Scanner;

public class KalkulatorPPHAjie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Kalkulator PPh Progresif ---");
        System.out.print("Penghasilan Kena Pajak / PKP (Rp): ");
        double pkp = sc.nextDouble();

        final double BATAS1 = 60000000;   
        final double BATAS2 = 250000000;  
        final double BATAS3 = 500000000;  

        double pajak;

        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= BATAS1) {
            pajak = 0.05 * pkp;
        } else if (pkp <= BATAS2) {
            double pajakLapisan1 = 0.05 * BATAS1;                 
            double pajakLapisan2 = 0.15 * (pkp - BATAS1);          
            pajak = pajakLapisan1 + pajakLapisan2;
        } else if (pkp <= BATAS3) {
            double pajakLapisan1 = 0.05 * BATAS1;
            double pajakLapisan2 = 0.15 * (BATAS2 - BATAS1);       
            double pajakLapisan3 = 0.25 * (pkp - BATAS2);          
            pajak = pajakLapisan1 + pajakLapisan2 + pajakLapisan3;
        } else {
            double pajakLapisan1 = 0.05 * BATAS1;
            double pajakLapisan2 = 0.15 * (BATAS2 - BATAS1);
            double pajakLapisan3 = 0.25 * (BATAS3 - BATAS2);       
            double pajakLapisan4 = 0.30 * (pkp - BATAS3);          
            pajak = pajakLapisan1 + pajakLapisan2 + pajakLapisan3 + pajakLapisan4;
        }

        System.out.printf("PKP          : Rp%.0f%n", pkp);
        System.out.printf("PPh 21 wajib : Rp%.0f%n", pajak);

        sc.close();
    }
}
