Algoritmo Multiplo_aleatorio
	Escribir "Encontraremos un numero aleatorio entre 0-1000"
	al<-(Aleatorio(0,1000))
	Escribir "EL numero aleatorio es: ",al
	Si (al mod 5 == 0) y (al<=625) Entonces
		Escribir "Correcto" 
	SiNo
		Escribir "Incorrecto"
	Fin Si
FinAlgoritmo
