# SearchingAlgorithms

----

Binaria y Lineal

Binario (No el mismo que el código pero representa la búsqueda binaria)

----

Funcion pos = busqueda_binaria (arreglo Por Referencia, ce Por Valor, elem Por Valor)
	Definir encontro Como Logico
	
	encontro = Falso
	
	Definir p_inicial Como Entero
	
	Definir p_final Como Entero
	
	Definir p_medio Como Entero
	
	p_inicial = 1
	
	p_final = ce
	
	pos = -1
	
	Mientras (encontro = falso ) Y (p_inicial < p_final) Hacer
	
		p_medio = trunc((p_inicial + p_final)/2)
		
		Si arreglo[p_medio] = elem Entonces
		
			encontro = Verdadero
			
			pos = p_medio
			
		SiNo
		
			Si arreglo[p_medio] < elem Entonces
			
				p_inicial = p_medio + 1
				
			SiNo
			
				p_final = p_medio - 1
				
			FinSi
			
		FinSi
		
	FinMientras
	
FinFuncion


Funcion imprimir_arreglo(arreglo Por Referencia, ce Por Valor)

	Para i = 1 Hasta ce Con Paso 1 Hacer
	
		Escribir arreglo[i]
		
	FinPara
	
FinFuncion


Funcion ce = ingresar_arreglo (arreglo Por Referencia)

	i = 0
	
	Repetir
	
		Escribir "Ingrese nombre y apellido"
		
		Leer nombre
		
		Si nombre<>"" Entonces
		
			i = i + 1
			
			arreglo[i] = nombre
			
		FinSi
		
	Hasta Que nombre=""
	
	ce = i
	
FinFuncion


Algoritmo sin_titulo

	Dimension arreglo[50]
	
	ce = ingresar_arreglo(arreglo)
	
	imprimir_arreglo(arreglo,ce)
	
	Escribir "Ingrese un elemento a buscar"
	
	Leer elem
	
	pos = busqueda_binaria(arreglo,ce,elem)
	
	Si pos=-1 Entonces
	
		Escribir "El Elemento no se encuentra"
		
	SiNo
	
		Escribir "El elemento se ecuentra en la posición:", pos
		
	FinSi
	
FinAlgoritmo
