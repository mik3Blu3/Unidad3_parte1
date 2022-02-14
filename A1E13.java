import java.util.Scanner;

public class A1E13 {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String args[])
  {
    double pi = 3.141516;  
    int i = 0;
    while( i==0)
    {
        System.out.println("Ingrese el radio del cilindro:");
        double radioCilindro = entrada.nextDouble();
        System.out.println("Ingrese la altura del cilindro");
        double alturaCilindro = entrada.nextDouble();
        if((radioCilindro > 0) && (alturaCilindro >0))
        {
            System.out.println("Los datos son correctos ya que son positivos o almenos no negativos");
            System.out.println("");
            double areaCilindro = (pi*radioCilindro*radioCilindro);
            double volumenCilindro = (areaCilindro*alturaCilindro);
            System.out.println("El volumen del cilindro con magnitudes: radio "+radioCilindro+" y altura "+alturaCilindro+ " es : "+volumenCilindro+" U ^3 Aprox ");
            i = i+1;
        }else
        {
            System.out.println("Existen uno o ambos datos negativos porfavor verificar");
        }
    }
  }  
}
