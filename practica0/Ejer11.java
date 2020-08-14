import unpaz.ayp3.*;
public class Ejer11 {

	public static void main(String[] args) {
		
		int numero=0;
		numero=Consola.pedirEntero("ingrese entero");
		System.out.println("cantidad de cifras  "+cantCifras(numero));
	}
	static int cantCifras(int n){
		
	           if(n < 10)  //caso base
	              return 1;
	           else
	              return 1 + cantCifras(n/10);
	    }
		
	}

