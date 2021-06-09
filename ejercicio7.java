import java.util.Scanner;
import java.util.Random;
public class ejercicio7 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args [])
    {
        System.out.println("Vamos a generar un numero aleatorio entre 10 y 50 y le disminuiremos el 15% ");
        Random r = new Random();
        int numAleatorio = r.nextInt(50-10)+10; //genera un aleatorio entre 10 y 50
        double numPorcentaje = (numAleatorio*0.15);
        double numDisminuido = (numAleatorio - numPorcentaje);
        System.out.println("El numero generado aleatoriamente es: "+numAleatorio);
        System.out.println("El 15% del numero aleatorio es: "+numPorcentaje);
        System.out.println("El numero aleatorio disminuido el 15% es: "+numDisminuido);
    }
}
