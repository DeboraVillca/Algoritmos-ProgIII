import unpaz.ayp3.*;
public class Ejer14 {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero("ingrese numero");
		System.out.println( sumatoriaPares(numero));

	}
	static int sumatoriaPares(int n){
		
		int sum=0;
		if(n==0){
			return 0;
		}else 
		if (esPar(n)==true){
		 sum = n+sumatoriaPares(n-2);
		}
		return sum;
	}
	static boolean esPar(int n1 ){
		if(n1%2==0){
		return true;
		}else{
		return false;
		}
}
}
