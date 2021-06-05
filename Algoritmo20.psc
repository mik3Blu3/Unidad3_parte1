Algoritmo Capicua
	Escribir "Ingrese un numero de 5 digitos"
	leer num 
	Si num >=10000 y num <= 99999 Entonces
		dig1=trunc(num/10000) mod 10
		dig2=trunc(num/1000) mod 10
		dig3=trunc(num/1000) mod 10
		dig4 = trunc(num/10) mod 10
		dig5 = trunc(num mod 10) mod 10
		Escribir "LOS DIGITOS SON: "
		Escribir "1) ",dig1
		Escribir "2) ",dig2
		Escribir "3) ",dig3
		Escribir "4) ",dig4
		Escribir "5) ",dig5
		Si dig1 == dig5 y dig2 == dig4 Entonces
			Escribir "CAPICUA"
		SiNo
			Escribir "NO ES CAPICUA"
		Fin Si
	SiNo
		Escribir "El numero que ha ingresado es mayor de 5 digitos"
	Fin Si
FinAlgoritmo
