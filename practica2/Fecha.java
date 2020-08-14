
public class Fecha {
		int dia;
		int mes;
		int anio;
 Fecha(int dia, int mes, int anio) {
	 if(validar(dia,mes,anio)){
	 this.dia=dia;
	 this.mes=mes;
	 this.anio=anio;
	 }
	 else{
		 this.dia=1;
		 this.mes=1;
		 this.anio=2000;
	 }
	}
	public String toString(){
		String mesletra;
		switch(this.mes){
		case 1:
			mesletra="Enero";
			break;
		case 2:
			mesletra="Febrero";
			break;
		case 3:
			mesletra="Marzo";
			break;
		case 4:
			mesletra="Abril";
			break;
		case 5:
			mesletra="Mayo";
			break;
		case 6:
			mesletra="Junio";
			break;
		case 7:
			mesletra="Julio";
			break;
		case 8:
			mesletra="Agosto";
			break;
		case 9:
			mesletra="Septiembre";
			break;
		case 10:
			mesletra="Octubre";
			break;
		case 11:
			mesletra="Noviembre";
			break;
		case 12:
			mesletra="Diciembre";
			break;
		default:{
			mesletra="error";
			break;
		}
		
		}
		return this.dia+" " + mesletra + " "+this.anio;
	}
		boolean mismaFecha(Persona otro){
			if (this.dia==otro.fecha_nacimiento.dia && this.mes==otro.fecha_nacimiento.mes && this.anio==otro.fecha_nacimiento.anio){
			return true;	
			}else{
				return false;
			}
		}
	public boolean validar(int dia,int mes,int anio){
		if (this.dia<1 && this.dia>31)
			return false;
			if(this.mes<1 && this.mes>12)
			return false;
		if(this.anio<0)
			return false;
		else
			return true;
	}
	public boolean esAnterior(Fecha otra)
	{
		if(this.anio < otra.anio)
		{
			return true;
		}
		else if(this.anio == otra.anio)
		{
			if(this.mes < otra.mes)
			{
				return true;
			}
			else if(this.mes == otra.mes)
			{
				if(this.dia < otra.dia)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean esIgual(Fecha otra)
	{
		return (this.dia == otra.dia && this.mes == otra.mes
				&& this.anio == otra.anio);
	}
	
	public boolean esPosterior(Fecha otra)
	{
		if(this.anio > otra.anio)
		{
			return true;
		}
		else if(this.anio == otra.anio)
		{
			if(this.mes > otra.mes)
			{
				return true;
			}
			else if(this.mes == otra.mes)
			{
				if(this.dia > otra.dia)
				{
					return true;
				}
			}
		}
		return false;
	}
}
