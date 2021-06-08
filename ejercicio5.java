import java.util.Scanner;
public class ejercicio5 {
    static Scanner entrada =new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese el numero que desea saber el proximo siguiente: ");
        int num = entrada.nextInt();
        int numeroSiguiente = (num+1);
        System.out.println("El siguiente numero despues de "+num+ " es: "+numeroSiguiente);
    }
}
