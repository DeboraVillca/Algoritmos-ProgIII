import unpaz.ayp3.*;
public class Ejer18b {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero();
		System.out.println(iterSumatoriaPares(numero));

	}
	static int iterSumatoriaPares(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			if(i%2==0){
				sum=sum+i;
			}
		}
		
		return sum;
		
	}
}
