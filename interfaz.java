package proyecto1_metodologia;

import java.util.Scanner;

public class interfaz {
	public static void main(String[] args) {
		String barra = "===================================================";
		System.out.println(barra + "\n" + "Bienvenido a la interfaz del 1er proyecto!\n" + barra);
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		int opcion;
		int n;
		int resultado = 0;
		
		while(!salir) {
			System.out.println("Por favor, seleccione una opción");
			System.out.println("1. Cálculo con una fórmula cerrada");
			System.out.println("2. Cálculo con algoritmo iterativo");
			System.out.println("3. Cálculo conalgoritmo recursivo");
			
			opcion = sc.nextInt();
			System.out.println("Ahora introduzca el número tetraédrico que desea encontrar");
			n = sc.nextInt();
			
			long t0 = 0;
			long t1 = 0;
			long deltaT = 0;
			
			switch (opcion) {
			case 1:
				t0 = System.nanoTime();
				resultado = metodos.Metodo1(n);
				t1 = System.nanoTime();
				break;
			case 2:
				t0 = System.nanoTime();
				resultado = metodos.Metodo2(n);
				t1 = System.nanoTime();
				break;
			case 3:
				t0 = System.nanoTime();
				resultado = metodos.Metodo3(n);
				t1 = System.nanoTime();
				break;
			}
			deltaT = t1 - t0;
			System.out.println("El número es: " + resultado);
			System.out.println("El tiempo usado para emplear el método elegido es: " + deltaT + "ns");
			System.out.println("(Recuerda: Es recomendable ejecutar el código más de una vez para ver valores adecuados)\n");
		}
	}

}
