import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
