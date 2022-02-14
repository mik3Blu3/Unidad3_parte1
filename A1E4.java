import java.util.Scanner;
public class A1E4 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[]) 
    {
            System.out.println("Ingrese el numero al cual desea sacarle el cuadrado y el cubo");
            int num = entrada.nextInt();
            System.out.println("");
             int numeroCuadrado = (num*num);
             int numeroCubo = (num*num*num);
            System.out.println("El cuadrado del numero "+num+ " es "+numeroCuadrado+" y el cubo del mismo es "+numeroCubo);  
    }
}
