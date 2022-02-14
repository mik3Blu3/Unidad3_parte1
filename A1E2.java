import java.util.Scanner;

public class A1E2 {
    public static void main (String args[])
    {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de paises y capitales");
        System.out.println("Ingrese el nombre del pais ");
        String nombrePais = entrada.nextLine();
        System.out.println("Ingrese la capital del Pais mencionado anteriormente");
        String capitalPais = entrada.nextLine();
        System.out.println("El pais: "+nombrePais+ " Tiene como capital: "+capitalPais);
    }
}
