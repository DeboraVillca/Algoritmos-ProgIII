public class Persona {
	String nombre;
	Fecha fecha_nacimiento;
	Persona grupo[]; 

	public Persona(String nombre, Fecha f_nac) {
		this.nombre=nombre;
		this.fecha_nacimiento=f_nac;
	}
	
	public String toString(){
		return "nombre "+this.nombre+ " fecha de nacimiento " + this.fecha_nacimiento.dia +"/"+ this.fecha_nacimiento.mes +"/"+ this.fecha_nacimiento.anio;
	}
	boolean masJovenQue(Persona otro){
		if(this.fecha_nacimiento.anio>otro.fecha_nacimiento.anio){
		 return true;
		}else if(this.fecha_nacimiento.anio==otro.fecha_nacimiento.anio && this.fecha_nacimiento.mes>otro.fecha_nacimiento.mes){
			return true;}
		else if (this.fecha_nacimiento.anio==otro.fecha_nacimiento.anio && this.fecha_nacimiento.mes==otro.fecha_nacimiento.mes && this.fecha_nacimiento.dia>otro.fecha_nacimiento.dia)
		return true;
		
		else return false;
		
	}
	
	boolean tocayo(Persona otro) {
		if(this.nombre.equals(otro.nombre)){
			return true;
		}else{
		return false;}
		
	}
	boolean mismaPersona(Persona otro) {
		if (this.nombre.equals(otro) && this.fecha_nacimiento.equals(otro.fecha_nacimiento)){
			return true;
		}else{
		return false;} 
		
	}
	//Si se agrega la variable de instancia int DNI con el metodo del punto 4 ,
	//es correcto que solo compare DNI  sin importar nombre y edad
	 static Persona masJoven(Persona[] grupo){
		Persona p = grupo[0];
		for(int i=0;i<grupo.length;i++){
			if(grupo[i].masJovenQue(p)){
				p=grupo[i];
			}
		}
		return p;
		 }
	 static Persona buscar(Persona[] grupo, String nombre){
		Persona p=null;
		 for(int i=0;i<grupo.length;i++){
				if(grupo[i].nombre.equals(nombre)){
					p=grupo[i];
				}
		 }
		 
		return p;
		 
		 
	 }	

}
