import unpaz.ayp3.*;
public class Ejer9 {

	public static void main(String[] args) {
		
		int dia = 0;
		int mes = 0;
		int anio = 0;
		dia=Consola.pedirEntero("ingrese dia");
		mes=Consola.pedirEntero("ingrese mes");
		anio=Consola.pedirEntero("ingrese año");
		imprimirFecha(dia,mes,anio);
		
	}
	
	static void imprimirFecha(int dia,int mes, int anio){
		
		String meses= null;
		switch(mes){
		case 1: meses="enero";
		break;
		case 2: meses="febrero";
		break;
		case 3: meses="marzo";
		break;
		case 4: meses="abril";
		break;
		case 5: meses="mayo";
		break;
		case 6: meses="junio";
		break;
		case 7: meses="julio";
		break;
		case 8: meses="agosto";
		break;
		case 9: meses="septiembre";
		break;
		case 10: meses= "octubre";
		break;
		case 11: meses="noviembre";
		break;
		case 12: meses="diciembre";
		break;
		}
		
		System.out.println( +dia +" de " +mes +" de "+anio);
		
		
	}

}
