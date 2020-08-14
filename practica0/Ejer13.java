import unpaz.ayp3.*;
public class Ejer13 {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero("ingrese numero");
		
		System.out.println(sumatoria(numero));
	}

	static int sumatoria(int n){
		int sum = 0;
		
		if(n==1){		//caso base (corte)
			return 1;
		}else{
			sum= n+sumatoria(n-1);//llamado recursivo
		}
		
		return sum;
		
	}
	
}
