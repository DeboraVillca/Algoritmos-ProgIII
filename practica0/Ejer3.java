import unpaz.ayp3.*;
public class Ejer3 {

	public static void main(String[] args) {
		
	int a = 0;
	int b = 0;
	imprimirSuma(a,b);
	}
	///ejercicio 6
static void imprimirSuma(int a,int b){
	int numero1;
		int numero2;
		
		numero1=Consola.pedirEntero("ingrese el primer numero");
		numero2=Consola.pedirEntero("ingrese el segundo numero");
		
		System.out.println("La suma de los numeritos es: "+(numero1+numero2));

	
		}
}
