package vista;
import java.util.Scanner;
import modelo.OperacionesBasicas;

public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a = s.nextDouble();
        System.out.println("Ingrese b: ");
        double b = s.nextDouble();

        OperacionesBasicas op = new OperacionesBasicas(a, b);
        System.out.println("La suma es: " + op.Suma());
        System.out.println("La resta es: " + op.Resta());
        System.out.println("La multiplicación es: " + op.Multiplicacion());
        System.out.println("La división es: " + op.Division());
    }
}
