
public class Agenda {
	Persona[] contactos;
	String[] telefonos;
	public Agenda(int tamanio) {
		
		this.contactos = new Persona[tamanio];
		this.telefonos = new String[tamanio];
	}
	void guardar(Persona contacto, String telefono){
		boolean agendado=false;
		for(int i=0;i<this.contactos.length;i++){
			if(this.contactos[i]==null && agendado==false ){
			this.contactos[i]=contacto;
			this.telefonos[i]=telefono;
			agendado=true;
			}	
		}	
	}
	void imprimir(){
		for(int i=0;i<this.contactos.length;i++){
			System.out.println(contactos[i]+" tel.:"+telefonos[i]);
		}
	}
	void eliminar(Persona contacto){
		boolean eliminado=false;
			for(int i=0;i<this.contactos.length;i++){
					if(contacto.equals(this.contactos[i])){
						this.contactos[i]=null;
						this.telefonos[i]=null;
						eliminado=true;
					}
				
			}
		}
	
	 boolean pertenece(Persona contacto){
		 for(int i=0;i<this.contactos.length;i++){
			 if(contacto.equals(this.contactos[i])){
				return true;
			 }
		 }
		return false;
		
	}
	 String dameTelefono(Persona contacto){
		 String t=null;
		 for(int i=0;i<this.contactos.length;i++){
				if(contacto.equals(this.contactos[i])){
					t=telefonos[i];
				
			 }
		 }
		 return t;
	 }
}
