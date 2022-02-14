import java.util.Scanner;
public class A1E16 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Escriba los tres numeros para comparar cual es el mayor (deben de ser diferentes cada uno)");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        if((num1 != num2) && (num1 != num3) && (num2 != num3))
        {
            System.out.println("Los numeros introducidos son diferentes");
            if((num1 > num2 ) && (num1 > num3))
            {
                System.out.println("El numero mayor es: "+num1);
            }else if((num2 > num1) && (num2 > num3)){
                System.out.println("El numero mayor es: "+num2);
            }else{
                System.out.println("El numero mayor es: "+num3);
            }
        }else{
            System.out.println("Uno o mas numeros ingresados son iguales porfavor corroborar");
        }
    }
}
