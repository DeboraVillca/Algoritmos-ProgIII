import unpaz.ayp3.*;
public class Ejer15 {

	public static void main(String[] args) {
		double numero=0;
		numero=Consola.pedirDecimal();
		int exponente=0;
		exponente=Consola.pedirEntero();
		System.out.println(potencia(numero,exponente));
	}
	static double potencia(double x, int a){
		
	
		if (a==0){
			return 1;
		}else if (a==1){
			return x;
		}else {
			return x*potencia(x,a-1);
		}
			
		
		
		
	}
}
