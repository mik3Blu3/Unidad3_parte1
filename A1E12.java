import java.util.Scanner;

public class A1E12 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese los grados celsius: ");
        Double gradosCelsius = entrada.nextDouble();
        double gradosFarenheit = ((gradosCelsius*1.8)+32);
        System.out.println("Los grados celsius "+gradosCelsius+" Son equivalentes a "+gradosFarenheit+" grados farenheit");
    }
}
