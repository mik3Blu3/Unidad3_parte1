import java.util.Scanner;
public class ejercicio20 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese un numero de 5 digitos paras saber si es capicua o no");
        int num = entrada.nextInt();
        if((num >= 10000) && (num <= 99999))
        {
            int dig1 = ((Math.toIntExact(num/10000)) % 10);
            int dig2 = (Math.toIntExact(num/1000) % 10);
            int dig3 = (Math.toIntExact(num/1000) % 10);
            int dig4 = (Math.toIntExact(num/10) % 10);
            int dig5 = (Math.toIntExact(num % 10) %10);
            System.out.println("Los digitos son: ");
            System.out.println("1) "+dig1);
            System.out.println("2) "+dig2);
            System.out.println("3) "+dig3);
            System.out.println("4) "+dig4);
            System.out.println("5) "+dig5);
            if((dig1 == dig5) && (dig2 == dig4))
            {
                System.out.println("CAPICUA");
            }else{
                System.out.println("NO ES CAPICUA");
            }
        }else{
            System.out.println("El numero que ha ingresado es mayor de 5 digitos");
        }
    }
}
