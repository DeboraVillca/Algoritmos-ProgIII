import unpaz.ayp3.*;
public class Ejer22 {

	public static void main(String[] args) {
		String cadena="";
		cadena=Consola.pedirTexto();
		System.out.println(esAbecedaria(cadena));

	}
public static boolean esAbecedaria(String s) {

	for (int i=0;i<s.length()-1;i++){
		if(s.charAt(i)>s.charAt(i+1)){
			return false;
		
	}
	}
	return true;
}
		
	
}
