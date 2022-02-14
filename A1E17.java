import java.util.Scanner;
public class A1E17 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese la longitud de los tres lados del triangulo para determinar de que tipo es: ");
        int l1 = entrada.nextInt();
        int l2 = entrada.nextInt();
        int l3 = entrada.nextInt();
        if((l1 == l2) && (l1==l3) && (l2==l3))
        {
            System.out.println("Es un triangulo EQUILATERO");
        }else if((l1 != l2) && (l2 != l3) && (l1 != l3)){
            System.out.println("Es un triangulo ESCALENO");
        }else{
            System.out.println("Es un triangulo ISOSCELES");
        }
    }
}
