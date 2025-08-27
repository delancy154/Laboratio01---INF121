import java.util.Scanner;

public class ModularEstructurado {
    static double[] numeros;
    
    public static double promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    
    public static double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numeros = new double[10];
        
        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        
        System.out.printf("El promedio es %.2f%n", promedio());
        System.out.printf("La desviación estándar es %.5f%n", desviacion());
        
        scanner.close();
    }
}