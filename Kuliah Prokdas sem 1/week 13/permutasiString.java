import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class permutasiString {

    // Fungsi pembantu untuk menghitung faktorial
    private static BigInteger faktorial(int n) {
        BigInteger hasil = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            hasil = hasil.multiply(BigInteger.valueOf(i));
        }
        return hasil;
    }

    // Fungsi utama untuk menghitung jumlah permutasi unik
    public static BigInteger hitungPermutasiUnik(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return BigInteger.ZERO;
        }

        int n = inputString.length();
        
        // 1. Hitung frekuensi kemunculan setiap huruf
        Map<Character, Integer> jumlahKarakter = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            jumlahKarakter.put(c, jumlahKarakter.getOrDefault(c, 0) + 1);
        }

        // 2. Hitung faktorial dari total panjang string (n!)
        BigInteger pembilang = faktorial(n);

        // 3. Hitung hasil kali faktorial dari masing-masing frekuensi huruf (n1! * n2! * ...)
        BigInteger penyebut = BigInteger.ONE;
        for (int jumlah : jumlahKarakter.values()) {
            penyebut = penyebut.multiply(faktorial(jumlah));
        }

        // 4. Bagi pembilang dengan penyebut
        return pembilang.divide(penyebut);
    }

    public static void main(String[] args) {
        // Contoh dari Soal 5
        String input1 = "AABBCC";
        System.out.println("Jumlah string berbeda dari '" + input1 + "': " + hitungPermutasiUnik(input1));
        
        // Uji coba menggunakan contoh dari Soal 1
        String input2 = "STATISTIKA";
        System.out.println("Jumlah string berbeda dari '" + input2 + "': " + hitungPermutasiUnik(input2));
    }
}