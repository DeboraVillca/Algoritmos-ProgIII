import unpaz.ayp3.*;
public class Ejer10 {

	public static void main(String[] args) {
		int numero=0;
		numero= Consola.pedirEntero("ingrese numero");
		System.out.println(esPar(numero));

	}
	static boolean esPar(int n ){
		
		if(n%2==0){
		return true;
		}else{
		return false;
		}
	}

}
