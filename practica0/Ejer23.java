import unpaz.ayp3.*;
public class Ejer23 {

	public static void main(String[] args) {
		String cadena="";
		cadena=Consola.pedirTexto();
		System.out.println(esCapicua(cadena));
	}
	static boolean esCapicua(String s) {
		boolean es=false;
		for(int i=0;i<=s.length()-1;i++){
			for(int j=s.length()-1;j>=0;j--){
				if(s.charAt(i)==s.charAt(j)){
					es=true;
					
				}else{
					es=false;
				}
			}

				}
		return es;
	}
}
