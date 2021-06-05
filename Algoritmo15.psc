Algoritmo comprobacion_valor_numero
	Escribir "Ingrese cualquier numero: "
	leer num 
	Si num < 0 y num <> 0 Entonces
		Escribir "El numero: ",num," es NEGATIVO"
	SiNo
		Si num >0 y  num <> 0 Entonces
			Escribir "El numero: ",num," es POSITIVO"
		SiNo
			Escribir "El numero: ",num, " es NEUTRO"
		Fin Si
	Fin Si
FinAlgoritmo
