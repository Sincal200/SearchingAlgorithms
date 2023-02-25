# SearchingAlgorithms

----

Evidencia de Ejecución: https://drive.google.com/file/d/1rzd3i4PSiclVrj5Us1wPw9RxrnYQDD5w/view?usp=sharing

----

Diagrama de Clases:

----

# Pseudocódigo: Binaria
(No el mismo que el código pero representa la búsqueda binaria)

----


Funcion position = busqueda_binaria (arreglo Por Referencia, conteo Por Valor, value Por Valor)

	Definir encontro Como Logico
	
	encontro = Falso
	
	Definir left Como Entero
	
	Definir right Como Entero
	
	Definir medio Como Entero
	
	left = 1
	
	right = conteo
	
	position = -1
	
	Mientras (encontro = falso ) Y (left < right) Hacer
	
		medio = trunc((left + right)/2)
		
		Si arreglo[medio] = value Entonces
		
			encontro = Verdadero
			
			position = medio
			
		SiNo
		
			Si arreglo[medio] < value Entonces
			
				left = medio + 1
				
			SiNo
			
				right =medio - 1
				
			FinSi
			
		FinSi
		
	FinMientras
	
FinFuncion


Funcion imprimir_arreglo(arreglo Por Referencia, conteo Por Valor)

	Para i = 1 Hasta conteo Con Paso 1 Hacer
	
		Escribir arreglo[i]
		
	FinPara
	
FinFuncion


Funcion conteo = ingresar_arreglo (arreglo Por Referencia)

	i = 0
	
	Repetir
	
		Escribir "Ingrese nombre y apellido"
		
		Leer nombre
		
		Si nombre<>"" Entonces
		
			i = i + 1
			
			arreglo[i] = nombre
			
		FinSi
		
	Hasta Que nombre=""
	
	conteo = i
	
FinFuncion


Algoritmo Búsqueda_Binaria

	Dimension arreglo[50]
	
	conteo = ingresar_arreglo(arreglo)
	
	imprimir_arreglo(arreglo,conteo)
	
	Escribir "Ingrese un elemento a buscar"
	
	Leer value
	
	position = busqueda_binaria(arreglo,conteo,value)
	
	Si position=-1 Entonces
	
		Escribir "El Elemento no se encuentra"
		
	SiNo
	
		Escribir "El elemento se ecuentra en la posición:", position
		
	FinSi
	
FinAlgoritmo

----

# Pseudocódigo Lineal
(No el mismo que el código pero representa la búsqueda lineal)

----

Funcion position = busqueda_lineal (arreglo Por Referencia, conteo Por Valor, value Por Valor) 
	
	Definir encontro Como Logico
	
	encontro = Falso
	
	i = 1
	
	position = -1
	
	Mientras (i<= conteo)Y(encontro = Falso) Hacer
	
		Si	arreglo[i] <> value Entonces
		
			i = i +1
			
		SiNo
		
			encontro = Verdadero
			
			position =  i
			
		FinSi
		
	FinMientras
	
FinFuncion


Funcion imprimir_arreglo(arreglo Por Referencia, conteo Por Valor)

	Para i = 1 Hasta conteo Con Paso 1 Hacer
	
		Escribir arreglo[i]
		
	FinPara
	
FinFuncion


Funcion conteo = ingresar_arreglo (arreglo Por Referencia)

	i = 0
	
	Repetir
	
		Escribir "Ingrese nombre y apellido"
		
		Leer nombre
		
		Si nombre<>"" Entonces
		
			i = i + 1
			
			arreglo[i] = nombre
			
		FinSi
		
	Hasta Que nombre=""
	
	conteo = i
	
FinFuncion


Algoritmo Búsqeda_Lineal

	Dimension arreglo[50]
	
	conteo = ingresar_arreglo(arreglo)
	
	imprimir_arreglo(arreglo,conteo)
	
	Escribir "Ingrese un elemento a buscar"
	
	Leer value
	
	position = busqueda_lineal(arreglo,conteo,value)
	
	Si position=-1 Entonces
	
		Escribir "El Elemento no se encuentra"
		
	SiNo
	
		Escribir "El elemento se ecuentra en la posición:", position
		
	FinSi
	
FinAlgoritmo
