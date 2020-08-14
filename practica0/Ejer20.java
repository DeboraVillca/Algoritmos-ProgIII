import unpaz.ayp3.*;
public class Ejer20 {

	public static void main(String[] args) {
		String s="";
		s=Consola.pedirTexto("ingrese texto");
		
		char c=Consola.pedirTexto().charAt(0);
		
		System.out.println(cantidadApariciones(s,c));
		
	}
	static int cantidadApariciones(String s, char c){
		int cant=0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == c)
				cant++;
		}
		
		return cant;
		
	}

}
