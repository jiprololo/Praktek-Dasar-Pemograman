import java.util.Scanner;

public class kalkulatorji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean operatorValid = true;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
                    operatorValid = false;
                }
                break;
            default:
                System.out.println("Error: Operator tidak dikenali!");
                operatorValid = false;
        }

        if (operatorValid) {
            System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        
        input.close();
    }
}