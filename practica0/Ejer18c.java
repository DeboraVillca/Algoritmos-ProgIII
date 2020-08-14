import unpaz.ayp3.*;
public class Ejer18c {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero();
		System.out.println(iterPotencia(numero));

	}
	static int iterPotencia(int n){
		int res=0;
		
		for(int i=0;i<=n;i++){
			res=i*n;
		}
		
		return res;
		
	}
}
