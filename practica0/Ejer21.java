import unpaz.ayp3.*;
public class Ejer21 {

	public static void main(String[] args) {
		String cadena="";
		cadena=Consola.pedirTexto();
		System.out.println(cantidadVocales(cadena));

	}
	static int cantidadVocales(String s){
		int cant=0;
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
				cant++;
			}
	
		}
		
		return cant;
		
	}
}
