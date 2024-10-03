import java.util.Scanner;

public class volumeKubus {

    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        double volume = hitungVolume(sisi);

        System.out.println("Volume kubus: " + volume);

        scanner.close();
    }
}
