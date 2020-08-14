import unpaz.ayp3.*;
public class Ejer26b {

	public static void main(String[] args) {
		int numero = 0;
		int f = Consola.pedirEntero("pedir numero");				
		long inicio = System.nanoTime();
		
		while(numero <= f)
		{
			if(numero == 0 || numero == 1)
				System.out.println(numero);
			else
				System.out.println(fibiter(numero));
			numero++;
		}
		
		long fin = System.nanoTime();
		double tiempo = (double) (fin - inicio) * 1e-9;
		
		System.out.println("Tiempo de ejecución: " + tiempo + " segundos");
	}
	
	static int fibiter(int n)
	{
		int a = 0, b = 1, c = 0;
		
		for(int i = 2; i <= n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}

	}


