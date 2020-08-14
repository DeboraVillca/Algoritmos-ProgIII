import unpaz.ayp3.*;
public class Ejer18a {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero();
		System.out.println(iterSumatoria(numero));
	}
	static int iterSumatoria(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			 sum=sum+i;
		}
		
		return sum;
		
	}
}
