import java.util.Scanner;
public class ejercicio3 {
     static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese el numero para el cual quiere sacar el doble y el triple");
        int num1 = entrada.nextInt();
        int dobleNumero = (2*num1);
        int tripleNumero = (3*num1);
        System.out.println("");
        System.out.println("El doble del numero "+num1+" es "+dobleNumero+" y el triple del mismo es "+tripleNumero);
    }
}
