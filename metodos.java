package proyecto1_metodologia;

public class metodos {
	
	public static int Metodo1(int n) {
		int resultado = 0;
		resultado = (n*(n+1)*(n+2))/6;
		return resultado;
	}
	
	public static int Metodo2(int n) {
		int resultado = 0;
		for(int i = 1; i <= n; i++) { 
			resultado += (i*(i+1))/2;
		}
		return resultado;
	}
	
	public static int Metodo3(int n) {
		if(n == 1) {
			return 1;
		} else {
			return (n*(n+1))/2 + Metodo3(n-1);
		}
	}

}
