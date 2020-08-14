import unpaz.ayp3.*;
public class Ejer19 {

	public static void main(String[] args) {
	String cadena="";
	cadena=Consola.pedirTexto("Ingrese texto");
		imprimirReversa(cadena);
		System.out.println();
	System.out.println(reversa(cadena));
	}
	static void imprimirReversa(String cadena){
		
//		for(int i=cadena.length()-1;i>=0;i--){
//		System.out.print(cadena.charAt(i));	
//}
	System.out.println(reversa(cadena));
	}
		static String reversa(String cadena){
			
			String reversa="";
		 	for(int i=cadena.length()-1;i>=0;i--){
		 		
		 		reversa=reversa+cadena.charAt(i);
			}
			return reversa;
		}
	

}
