import unpaz.ayp3.*;
public class Ejer26a {

	public static void main(String[] args) {
		int numero = 0;
		int f = Consola.pedirEntero("ingrese numero");				
		long inicio = System.nanoTime();
		while(numero <= f)
		{
			System.out.println(fibrec(numero));
			numero++;
		}
		long fin = System.nanoTime();
		double tiempo = (double) (fin - inicio) * 1e-9;
		
		System.out.println("Tiempo de ejecución: " + tiempo + " segundos");
	}
	
	static int fibrec(int n)
	{
		if(n == 0 || n == 1)
			return n;
		
		return fibrec(n - 1) + fibrec(n - 2);
	}

	}


