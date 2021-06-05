Algoritmo Tipo_triangulo
	Escribir 'Ingrese la longitud de los tres lados del triangulo para determiar que tipo es: '
	Leer l1
	Leer l2
	Leer l3
	Si l1==l2 Y l1==l3 Y l2==l3 Entonces
		Escribir 'Es un triangulo EQUILÁTERO'
	SiNo
		Si l1<>l2 Y l2<>l3 Y l1<>l3 Entonces
			Escribir 'Es un triangulo ESCALENO'
		SiNo
			Escribir 'Es un triangulo ISÓSCELES'
		FinSi
	FinSi
FinAlgoritmo
