import unpaz.ayp3.*;
public class Ejer18d {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero();
		System.out.println(iterFactorial(numero));
		

	}
	static int iterFactorial(int n){
		int fac=0;
		for(int i=(n-1);i>=1;i--){
			n=n*i;
		}
		return n;
	}
}
