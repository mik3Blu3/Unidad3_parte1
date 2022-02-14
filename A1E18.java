import java.util.Scanner;
public class A1E18 
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Ingrese un numero entero de maximo 4 digitos");
        int num = entrada.nextInt();
        if((num >= 0) && (num <= 99))
        {
            System.out.println("Ingreso un numero de dos digitos");
            int dig1 = Math.toIntExact(num/10);
            System.out.println("Primer digito "+dig1);
            int dig2 = (num - Math.toIntExact(num/10)*10);//Math.toIntExact sirve para convertir un numero decimal a la parte entera
            System.out.println("Segundo digito "+dig2);
            int sumaDigitos = (dig1+dig2);
            System.out.println("La suma de los digitos es "+sumaDigitos);
        }else if((num >= 10) && (num <= 999)){
            System.out.println("Numero de tres digitos");
            int dig1Real = Math.toIntExact(num/100);
            System.out.println("Primer digito "+dig1Real);
            int dig2 = (num - Math.toIntExact(num/100)*100);
            int dig2Real = Math.toIntExact(dig2/10);
            System.out.println("Segundo digito "+dig2Real);
            int dig3Real =Math.toIntExact(dig2 % 10);
            System.out.println("Tercer digito "+dig3Real);
            int sumaDigitos = (dig1Real+dig2Real+dig3Real);
            System.out.println("La suma de los tres digitos es:"+sumaDigitos);
        }else if((num >= 1000) && (num <= 9999)){
            System.out.println("Numero de 4 digitos");
            int dig1Real =Math.toIntExact(num/1000);
            System.out.println("Primer digito "+dig1Real);
            int dig2 = (num-Math.toIntExact(num/1000)*1000); 
            int dig2Real = Math.toIntExact(dig2/100);
            System.out.println("Segundo digito "+dig2Real);
            int dig3 = (dig2 % 100);
            int dig3Real = Math.toIntExact(dig3/10);
            System.out.println("Tercer digito "+dig3Real);
            int dig4Real = (dig3 % 10);
            System.out.println("Cuarto digito "+dig4Real);
            int sumaDigitos = Math.toIntExact(dig1Real+dig2Real+dig3Real+dig4Real);
            System.out.println("La suma de los cuatro digitos es: "+sumaDigitos);

        }else{
            System.out.println("El numero ingresado es mayor de 4 digitos porfavor corroborar!");
        }
    }
}
    