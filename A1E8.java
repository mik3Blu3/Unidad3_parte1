import java.util.Scanner;
public class A1E8 {
    static Scanner entrada = new Scanner(System.in);
    public static void main (String args [])
    {
        System.out.println("Ingrese los tres numeros a sacar el promedio: ");
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int  num3 = entrada.nextInt();
        int promNum = (num1+num2+num3)/3;
        System.out.println("El promedio de los tres numeros es: "+promNum);
    }

}
