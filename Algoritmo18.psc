Algoritmo Determinar_suma_4digitos
	Escribir "Ingrese un numero entero de maximo 4 digitos"
	leer num
	Si num>=0 Y num <= 99 Entonces
		Escribir "Numero de dos digitos"
		dig1=trunc(num/10)
		Escribir "Primer Digito: ",dig1
		dig2=num-trunc(num/10)*10
		Escribir "Segundo Digito: ",dig2
		sumadigitos= dig1+dig2
		Escribir "LA SUMA DE LOS DIGITOS ES: ",sumadigitos
	SiNo
		Si num>=100 Y num <=999 Entonces
			Escribir "Numero de tres digitos"
			dig1real=trunc(num/100)
			Escribir "Primer Digito: ",dig1real
			dig2 = num-trunc(num/100)*100
			dig2real=trunc(dig2/10)
			Escribir "Segundo Digito: ",dig2real
			dig3real=trunc(dig2 mod 10)
			Escribir "Tercer Digito: ",dig3real
			sumadigitos=dig1real+dig2real+dig3real
			Escribir "La suma de los 3 digitos es: ",sumadigitos
		SiNo
			si num>=1000 y num <= 9999 Entonces
				Escribir "Numero de cuatro digitos"
				dig1real = trunc(num/1000)
				Escribir "Primer Digito: ",dig1real
				dig2 = num-trunc(num/1000)*1000
				dig2real=trunc(dig2/100)
				Escribir "Segundo Digito: ",dig2real
				dig3 = (dig2 mod 100)
				dig3real = trunc(dig3/10)
				Escribir "Tercer Digito: ",dig3real
				dig4real=(dig3 mod 10)
				Escribir "Cuarto Digito: ",dig4real
				suma4digitos = dig1real+dig2real+dig3real+dig4real
				Escribir "La sunma de los cuatro digitos es: ",suma4digitos
			SiNo
				Escribir "El numero ingresado es mayor de 4 digitos porfavor corroborar"
			FinSi
		FinSi
		
	FinSi
FinAlgoritmo
