import java.util.Scanner;

public class ejercicio14 {
    static Scanner entradad =  new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese el primer numero:");
        int num1 = entradad.nextInt();
        System.out.println("Ingrese el divisor");
        int numDiv = entradad.nextInt();
        double resultado = (num1 % numDiv);
        if(resultado == 0)
        {
            System.out.println("SI ES DIVISIBLE!!");
        }else{
            System.out.println("NO ES DIVISIBLE!!");
        }
    }
}
