import java.util.Scanner;

public class StudiKasus2Jie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Tanah (m): ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan Lebar Tanah (m): ");
        double lebar = sc.nextDouble();

        System.out.print("Masukkan Diameter Kolam (m): ");
        double diameter = sc.nextDouble();

        System.out.print("Masukkan Panjang Sisi Taman (m): ");
        double sisi = sc.nextDouble();

        double luasTanah = panjang * lebar;
        double r = diameter / 2;
        double luasKolam = Math.PI * r * r;
        double luasTaman = sisi * sisi;

        double luasSisa = luasTanah - (luasKolam + luasTaman);

        System.out.println("Luas tanah yang tidak digunakan: " + luasSisa + " m2");
    }
}