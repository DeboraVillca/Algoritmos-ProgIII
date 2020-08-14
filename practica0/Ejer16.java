import unpaz.ayp3.*;
public class Ejer16 {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero();
		System.out.println(factorial(numero));

	}
	static double factorial(int n){
		
		if(n==0){
			return 1;
		}else 
		return	n*factorial(n-1);
		 
		
	}
}
