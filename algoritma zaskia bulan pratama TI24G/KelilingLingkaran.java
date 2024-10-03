import java.util.Scanner;

public class KelilingLingkaran {

    public static double hitungKeliling(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        double keliling = hitungKeliling(jariJari);

        System.out.println("Keliling lingkaran: " + keliling);

        scanner.close();
    }
}
