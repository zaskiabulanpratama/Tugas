import java.util.Scanner;

public class luasPersegiPanjang {

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        double luas = hitungLuas(panjang, lebar);

        System.out.println("Luas persegi panjang: " + luas);

        scanner.close();
    }
}
