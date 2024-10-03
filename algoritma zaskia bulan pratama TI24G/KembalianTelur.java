import java.util.Scanner;

public class KembalianTelur {
    
    public static double[] hitungKembalian(double jumlahTelurKg, double hargaPerKg, double uangDiberikan) {
        double totalBayar = jumlahTelurKg * hargaPerKg;
        double kembalian = uangDiberikan - totalBayar;
        return new double[]{totalBayar, kembalian};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double hargaPerKg = 28000;
        
        System.out.print("Masukkan jumlah telur (kg): ");
        double jumlahTelurKg = scanner.nextDouble();
        
        System.out.print("Masukkan jumlah uang yang diberikan: ");
        double uangDiberikan = scanner.nextDouble();
        
        double[] hasil = hitungKembalian(jumlahTelurKg, hargaPerKg, uangDiberikan);
        double totalBayar = hasil[0];
        double kembalian = hasil[1];
        
        System.out.println("\nJumlah Telur (kg): " + jumlahTelurKg + " kilo");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("Uang yang diberikan: " + uangDiberikan);
        System.out.println("Uang kembalian: " + kembalian);
        
        scanner.close();
    }
}
