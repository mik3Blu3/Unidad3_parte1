import java.util.Scanner;
public class ejercicio11 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese la cantidad de centimetros que desea pasar a yds/mts/fts/in");
        double numCms = entrada.nextDouble();
        double yds = (numCms*0.0109361);
        double mts = (numCms *0.01);
        double fts = (numCms * 0.032808);
        double in = (numCms*0.393701);
        System.out.println("Los "+numCms+" centimetros equivalen a "+yds+" yardas");
        System.out.println("Los "+numCms+" centimetros equivalen a "+mts+" metros");
        System.out.println("Los "+numCms+" centimetros equivalen a "+fts+" pies");
        System.out.println("Los "+numCms+" centimetros equivalen a "+in+" pulgadas");
    }
}
