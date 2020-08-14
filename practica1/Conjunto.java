
public class Conjunto {
	int[] elementos;
	int cantidad;
	public Conjunto() {
		
		this.elementos = new int[0];
		this.cantidad = 0;
	}
	
	void agregar(int n) {
		int i=0;
		while(i<=this.cantidad-1&& this.elementos[i]!=n && this.elementos[i]!=0)
			i++;
			if(i==cantidad){
				cantidad++;
				int[] nuevo=new int[cantidad];//auxiliar
				for(int j=0;j<cantidad-1;j++){
					nuevo[j]=this.elementos[j];
				}
				nuevo[cantidad-1]=n;
				this.elementos=nuevo;
			}
			if(this.elementos[i]==0 && i<cantidad)
				this.elementos[i]=n;
		
			
	}
	void imprimir(){
	System.out.print("{");
		for(int i=0;i<this.elementos.length;i++)
		System.out.print(this.elementos[i]+ ";");
	System.out.println("}");
	}
	boolean pertenece(int n){
		
		for(int i=0;i<this.elementos.length;i++)
			if(n==this.elementos[i])
				return true;
	return false;
	}
	
	void quitar(int n){
		Conjunto nuevo=new Conjunto();//para redimensionar se crea uno nuevo
		for(int i=0;i<this.cantidad;i++){
			if(n!=this.elementos[i]){
				nuevo.agregar(this.elementos[i]);
			}
		}
		this.elementos=nuevo.elementos; //reasignacion
		this.cantidad=cantidad-1;
	}
	
	static Conjunto union(Conjunto c1, Conjunto c2) {
		Conjunto nuevo=new Conjunto();
		nuevo.elementos=c1.elementos;
		nuevo.cantidad=c1.cantidad;
		for(int i=0;i<c2.cantidad;i++){
			nuevo.agregar(c2.elementos[i]);
		}
		return nuevo;
		
	}
	
	static Conjunto interseccion(Conjunto c1, Conjunto c2){
		Conjunto nuevo= new Conjunto();
		for(int i=0;i<c1.cantidad;i++){
			for(int j=0;j<c2.cantidad;j++){
				if(c1.elementos[i]==c2.elementos[j]){
					nuevo.agregar(c1.elementos[i]);
				}
				
			}
		}
			
	return nuevo;
	}
	static Conjunto resta(Conjunto c1, Conjunto c2) {
		Conjunto aux= Conjunto.interseccion(c1, c2);
		Conjunto nuevo=new Conjunto();
		nuevo.elementos=c1.elementos;
		nuevo.cantidad=c1.cantidad;
		
		for(int i=0;i<aux.cantidad;i++){
			nuevo.quitar(aux.elementos[i]);
		}
		return nuevo;
	}
	
	void restar(Conjunto c){
		Conjunto aux = new Conjunto();
		
		for (int i = 0; i <cantidad; i++) {
			for (int j = 0; j < c.cantidad; j++) {
				if(elementos[i]==c.elementos[j])
					aux.agregar(c.elementos[j]);
	
			}
		}
		for (int k = 0; k <aux.cantidad; k++) {
			this.quitar(aux.elementos[k]);
		
		}
	}
	public int[] getElementos() {
		return elementos;
	}

	public void setElementos(int[] elementos) {
		this.elementos = elementos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
		
	}

