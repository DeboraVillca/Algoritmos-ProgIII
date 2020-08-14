import unpaz.ayp3.*;
public class Ejer24 {
	public static void main(String[] args) {
		String cadena="";
		cadena=Consola.pedirTexto();
System.out.println(esSinRepetidos(cadena));
	}
	
	static boolean esSinRepetidos(String s) {
	int cont=0;
	for (int i = 0; i < s.length(); i++){
		    char caracter = s.charAt(i);

		    for (int j = 0; j <s.length(); j++){
		        if (s.charAt(j) == caracter) {
		           cont++;
		        }else{
		        	cont=0;
		        }
		    }
	}
		    if(cont>1){
			return false;
		}else
			return true;
	}
}