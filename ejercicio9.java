import java.util.Scanner;
public class ejercicio9 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese la primera palabra");
        String palabraUno = entrada.nextLine();
        System.out.println("Ingrese la segund palabra");
        String palabraDos = entrada.nextLine();
        String a = palabraDos;
        String b = palabraUno;
        System.out.println("El valor en que ingreso las palabras fue ("+palabraUno+" , "+palabraDos+")");
        System.out.println("Intercambiaremos los valores de (a,b)");
        System.out.println("El nuevo valor del conjunto de palabras es ("+a+ ","+b+")");
    }
}
