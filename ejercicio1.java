import java.util.Scanner;

public class ejercicio1 
{   
   static Scanner entrada = new Scanner(System.in);
    public static void main (String Ags[])
    {
        System.out.println("Bienvenido al programa suma de dos Numeros: ");
        System.out.println("Ingrese el primer Numero");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo Numero");
        int numero2 = entrada.nextInt();
         int sumaNumeros = (numero1 + numero2);
        System.out.println("El resultado de la suma es:  "+sumaNumeros);
        System.out.println("");        
    }
}