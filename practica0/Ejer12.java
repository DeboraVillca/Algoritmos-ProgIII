import unpaz.ayp3.*;
public class Ejer12 {

	public static void main(String[] args) {
		int numero0=0;
		numero0=Consola.pedirEntero();
		int numero1=0;
		numero1=Consola.pedirEntero();
		System.out.println(esDivisible(numero0,numero1));
	}
	static boolean esDivisible(int n, int m){
		if(n%m==0){
			return true; 
		}else
		
		return false;
		
	}
}
