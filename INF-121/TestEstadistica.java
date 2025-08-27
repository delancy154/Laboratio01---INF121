import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        Estadistica stats = new Estadistica(numeros);
        
        System.out.printf("El promedio es %.2f%n", stats.promedio());
        System.out.printf("La desviación estándar es %.5f%n", stats.desviacion());
        
        scanner.close();
    }
}