import unpaz.ayp3.*;
public class Ejer8 {

	public static void main(String[] args) {
		double x =0;
		double y=0;
		x=Consola.pedirDecimal("ingrese primer nota");
		y=Consola.pedirDecimal("ingrese segunda nota");
		ponerNota(x,y);

	}
	
	
	static void ponerNota(double x, double y ){
		
		double prom = (x+y)/2;
		
		if (prom>=7){
			System.out.println("promocionado");
		}else if (prom<7 && prom>=4){
			System.out.println("aprobado");
			
		}else {
			System.out.println("debe recuperar");
			
		}
		
	}

}
