import java.util.Scanner;

public class A1E10 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Bienvenido al programa que calcula el area y perimetro de un rectangulo: ");
        System.out.println("Ingrese la longitud de la base del rectangulo");
        int baseRectangulo = entrada.nextInt();
        System.out.println("Ingrese la longitud de la altura del rectangulo");
        int alturaRectangulo = entrada.nextInt();
        int areaRectangulo = (baseRectangulo*alturaRectangulo);
        int perimetroRectangulo = 2*(baseRectangulo+alturaRectangulo);
        System.out.println("El area del rectangulo de base "+baseRectangulo+" y altura "+alturaRectangulo+" es "+areaRectangulo+" U^2");
        System.out.println("El perimetro del rectangulo es de "+perimetroRectangulo+" U");
    }
}
