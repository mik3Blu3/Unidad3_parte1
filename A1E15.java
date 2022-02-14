import java.util.Scanner;
public class A1E15 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese cualquier numero:");
        int num = entrada.nextInt();
        if((num < 0) && (num != 0))
        {   
            System.out.println("EL numero "+num+" es NEGATIVO");
        }else if((num > 0) && (num != 0) ){
            System.out.println("El numero "+num+" es POSITIVO");
        }else{
            System.out.println("El numero "+num+" es NEUTRO");
        }
    }
}
