import unpaz.ayp3.*;
public class Ejer5 {

	public static void main(String[] args) {
	
		int a=0;
		int b=0;
		imprimirPromedio( a,b);

	}
	///ejercicio7
	static void imprimirPromedio(int a ,int b){
		float numero1;
		float numero2;
		
		numero1=Consola.pedirEntero("ingrese el primer numero");
		numero2=Consola.pedirEntero("ingrese el segundo numero");
		
		System.out.println("el promedio es: "+(numero1+numero2)/2);
	}

}
