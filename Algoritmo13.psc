Algoritmo Volumen_Cilindro
	Mientras i==0 Hacer
		Escribir 'Ingrese el radio del cilindro'
		Leer r
		Escribir 'Ingrese la altura del cilindro'
		Leer h
		Si r>=0 Y h>=0 Entonces
			Escribir 'Los datos son correctos ya que son positivos o almenos no negativos'
			area <- (3.141516*r*r)
			volumen <- (area*h)
			Escribir 'El volumen del cilindro con magnitudes: radio ',r,' y altura ',h,' es: ',volumen,' U^3 APROX'
			i <- 1
		SiNo
			Escribir 'Existen uno o ambos datos negativos porfavor verificar'
		FinSi
	FinMientras
FinAlgoritmo
