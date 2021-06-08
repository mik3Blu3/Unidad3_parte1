import java.util.Random;
import java.util.Scanner;
public class ejercicio6 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Bienvenido al numero aleatorio de 0 a 200");
        Random r = new Random();
        int numAleatorio = r.nextInt(200);
        double numPorcentaje = (numAleatorio*0.30);
        double numAumentadoPorcentaje = (numAleatorio + numPorcentaje);
        System.out.println("El numero generado aleatoriamente fue: "+numAleatorio);
        System.out.println("El 30% del numero aleatorio es: "+numPorcentaje);
        System.out.println("Entonces el numero aleatorio aumentado un 30% es: "+numAumentadoPorcentaje);
    }
}
