Algoritmo mayor_3numeros
	Escribir "Ingrese los tres numeros a comparar cual es el mayor (deben de ser diferentes cada uno)"
	leer num1
	leer num2
	leer num3
	Si num1<>num2 Y num1<>num3 Y num2<>num3 Entonces
		Escribir "Los numeros introducidos son diferentes... "
		Si num1>num2 Y num1>num3 Entonces
			Escribir "El numero mayor es: ",num1
		SiNo
			Si num2>num1 Y num2>num3 Entonces
				Escribir "El numero mayor es: ",num2
			SiNo
				Escribir "El numero mayor es: ",num3
			Fin Si
		Fin Si
	SiNo
		Escribir "Uno o mas numeros ingresados son iguales corroborar.."
	Fin Si
FinAlgoritmo
