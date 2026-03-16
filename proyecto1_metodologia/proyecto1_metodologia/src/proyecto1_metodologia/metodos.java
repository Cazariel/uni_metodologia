package proyecto1_metodologia;

public class metodos {
	/**
	 * Este metodo utiliza la formula directamente para averiguar el numero
	 * Complejidad algorítmica:  
	 *
	 *La complejidad de este algoritmo es O(1) ya que no tiene bucles ni recursión,
	 *y se limita a ejecutar una línea de código, por lo que solo se cuentan las 
	 *instrucciones que tiene el código y ya. 
	 *
	 *  @param n el numero de que queremos saber su tetraedrico
	 * @return devuelve el numero tetraedrico del numero
	 */
	public static int Metodo1(int n) {
		int resultado = 0;
		resultado = (n*(n+1)*(n+2))/6;
		return resultado;
	}
	/**
	 * Este metodo utiliza un bucle for para averiguar el numero utilizando esta formula de aqui:
	 * Te = ∑n i=1 [(𝒊(𝒊+1)/𝟐)]
	 * Complejidad algorítmica: 
	 *1.  Tamaño del problema 
	 *Podemos ver que el tamaño es n, que es la posición del número que queremos 	encontrar 
	 *2. Encontramos la operación básica: 
	 *Podemos ver en el código que la parte que más se repite es el bucle for 
	 *3. Importa el tamaño de la entrada? 
	 *Si que importa, ya que cuanto mayor sea n, mayor será el número de 		iteraciones del bucle for 
	 *4. Importa el orden de los elementos? 
	 *En este caso no importa, ya que solo introducimos una constante. Por tanto, 	basta con encontrar el peor caso  
	 *5. Como el tamaño de entrada importa, ¿cómo aumentan los índices en cada repetición? 
	 *Si miramos en el código, podemos ver que en cada iteración el índice i aumenta 	en 1 
	 *De acuerdo a toda esta información, podemos expresar el código mediante un sumatorio que al traducirlo y resolverlo nos queda: 
	 *∑n−1 i=1 = n + 1 – 1 = n 
	 *Donde el contenido del sumatorio es 1 debido a la única instrucción que contiene el for 
	 *Por tanto, la complejidad es: Θ(n) 
	 *(En notación Big-Theta porque la complejidad siempre será la misma) 
	 *  @param n el numero de que queremos saber su tetraedrico
	 * @return devuelve el numero tetraedrico del numero
	 */
	public static int Metodo2(int n) {
		int resultado = 0;
		for(int i = 1; i <= n; i++) { 
			resultado += (i*(i+1))/2;
		}
		return resultado;
	}
	/**
	 * Este metodo hace lo mismo del numero tetraedrico pero lo hace de manera recursiva y para hayar la complejidad hay que seguir los siguientes pasos:
	 * Primero encontramos la operación básica que da lugar a la recursión del programa: 
	 * (n*n+1))/2 + Metodo3(n-1) 
	 * Luego sacamos la relación de recurrencia 
	 * En este caso podemos utilizar el método de iteración 
	 * T(n-1) = T(n-2) + 1 
	 * T(n-2) = T(n-3) + 1  
 	 * De aqui sabemos que: T(n) = T(n-1) + 1 = T(n-2) + 1 + 1= T(n-2) + 2 = T(n-3) + 3 ... 
     * Y podemos distinguir claramente el patrón base: 
	 * T(n – k) + k 
	 * Donde k es el número de recurrencias 
	 * Ahora, sabemos en que el caso base es T(1) = 1, por el if que hay en el código. 
	 * A este caso base se puede llegar cuando n - k = 1, es decir, cuando k = n - 1	 
	 * Por lo tanto, si sustituyo en el caso base, puedo llegar a: 
	 * T(n – n + 1) + n – 1 = T(1) + n – 1 
	 * Y podemos ver que la complejidad es de Θ(n) 
	 * @param n el numero de que queremos saber su tetraedrico
	 * @return devuelve el numero tetraedrico del numero
	 */
	public static int Metodo3(int n) {
		if(n == 1) {
			return 1;
		} else {
			return (n*(n+1))/2 + Metodo3(n-1);
		}
	}

}
