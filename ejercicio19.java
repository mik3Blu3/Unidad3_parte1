import java.util.Scanner;
import java.util.Random;
public class ejercicio19 {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String args[])
  {
    Random r = new Random();
    System.out.println("Encontraremos un numero aleatorio entre (0-1000)");
    int numAleatorio = r.nextInt(1000);
    System.out.println("El numero aleatorio es "+numAleatorio);
    int numAlMod = (numAleatorio % 5);
    if((numAlMod == 0) && (numAleatorio <=625))
    {
        System.out.println("CORRECTO");
    }else{
        System.out.println("INCORRECTO");
    }
  } 
}
