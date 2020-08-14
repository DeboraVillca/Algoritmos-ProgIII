
public class ListaInt {
	private NodoInt primero;
	public ListaInt(){
		
	}
/////////////////////////////////////////////////////////////////
	int largo() {
		 int lst = 0;
		  NodoInt n = this.primero;//primer nodo
		  while (n != null) {//mientras que sea distinto a nulo
			  lst++;//contador
			  n = n.siguiente;//pasa al siguiente 
		  	}
		  	return lst;
		  }
/////////////////////////////////////////////////////////////////
	boolean estaVacia(){
		return(this.primero==null);
	}
/////////////////////////////////////////////////////////////////
	 void imprimir() {
		System.out.print("[");
		 NodoInt n = this.primero;
		  while (n != null) {
			  System.out.print(n.elemento + " ");
			  n = n.siguiente;
		  	}
		  System.out.println("]");
		  }
///////////////////////////////////////////////////////////////// 
	 void agregarAdelante(int x) {
		 NodoInt nuevo = new NodoInt(x);//crea nodo
		  	nuevo.elemento = x;//asiga elemento
		  	nuevo.siguiente = this.primero;//asigna referencia al primero
		  	this.primero = nuevo;//primero pasa a ser el nuevo
		  }
/////////////////////////////////////////////////////////////////	
	 public void agregarAtras(int x) {
	NodoInt ultimo = new NodoInt(x);
	 ultimo.elemento = x; // ultimo.siguiente = null; y asigno elemento
		  if (this.primero == null) {
			  this.primero = ultimo;//si esta null la lista , se le asigna
		 return;
		  }
		  NodoInt n = this.primero; //creo nodo referencia
		  while (n.siguiente != null) {//si su siguiente es distinto de null
			  n = n.siguiente;//se le asigna el siguiente
		  	}
		  	n.siguiente = ultimo;//el ultimo siguiente sera el que le asigne x parametro
		  }
/////////////////////////////////////////////////////////////////
	 public int suma(){
		 int sum=0;
		 NodoInt n=this.primero;
		 while(n!=null){
			 sum=sum+n.elemento;
			 n=n.siguiente;
		 }
		 return sum;
	 }
/////////////////////////////////////////////////////////////////
	 public double promedio() {
		 double prom=0;
		 NodoInt n=this.primero;
		 while(n!=null){
		 prom= this.suma()/this.largo();
		 n=n.siguiente;
		 }return prom;
	 }
/////////////////////////////////////////////////////////////////
	 public int iesimo(int pos){
		NodoInt n = this.primero;
		int i=0;
		int elem=0;
		if(pos>this.largo()||pos<0){
			throw new RuntimeException("Posicion incorrecta");
		}
		while (n != null) {
			 if(i==pos)
			 elem = n.elemento;
			 i++;
		n = n.siguiente;
		
	}	return elem;
	}
/////////////////////////////////////////////////////////////////
	 boolean buscar(int e){
	 NodoInt n = this.primero;
	 while (n != null) {
	 if(n.elemento==e){
		 return true;
	 }
	  n = n.siguiente;
	 	}
	return false;
	 }
/////////////////////////////////////////////////////////////////
	 public int maximo(){
		 int max=this.primero.elemento;
		 NodoInt n=this.primero;
		 while(n!=null){

			 if(n.elemento>max){
				 max=n.elemento;
			 }
			n=n.siguiente;
		 }
		 return max;
	 }
/////////////////////////////////////////////////////////////////
	 public boolean estaOrdenada(){
		 NodoInt n=this.primero;
		 NodoInt sigue=null;
		 while(n!=null){
			 sigue=n.siguiente;
			 while(sigue!=null){
			 if(n.elemento>sigue.elemento){
				return false; 
			 }
			 sigue=sigue.siguiente;	 
			 
			 }
			n=n.siguiente;
		 }	 
			 
		 return true;
	 }
/////////////////////////////////////////////////////////////////	 
	 public void ordenar() {
		 NodoInt n=this.primero;
		 NodoInt sigue=null;
		 int auxiliar=0;
		 while(n!=null){
			 sigue=n.siguiente;
			 while(sigue!=null){
			 if(n.elemento>sigue.elemento){
				cambiar(n, sigue,auxiliar);
			 }
			 sigue=sigue.siguiente;	 
			 
			 }
			n=n.siguiente;
		 }
		 
	 }
	 public void cambiar(NodoInt n,NodoInt sigue,int auxiliar){
		 auxiliar=n.elemento;
		 n.elemento=sigue.elemento;
		 sigue.elemento=auxiliar;
	 }
	 
/////////////////////////////////////////////////////////////////
	 public void rotarDerecha() {
		 NodoInt n=this.primero;
		 while(n!=null){
			 if(n.siguiente==null){
				 int aux=n.elemento;
				 quitar(n.elemento);
				 agregarAdelante(aux); 
			 }
		n=n.siguiente;	 
		 }
			 // 1,2,3,4  // 4,1,2,3 
	 } 
/////////////////////////////////////////////////////////////////	
	public void agregarEnPosicion(int pos, int elem) { 
		if(pos==0){
			agregarAdelante(elem);
		}
		if(pos==this.largo()){
			agregarAtras(elem);
		}
		if(pos>this.largo()||pos<0){
				throw new RuntimeException("Posicion incorrecta");
		}
		NodoInt nuevo = new NodoInt(elem);
		NodoInt anterior = this.buscado(pos - 1);
		nuevo.setSiguiente(anterior.getSiguiente());
		anterior.setSiguiente(nuevo);
	 }
	 public NodoInt buscado(int pos){
		
		 NodoInt buscado = this.primero;
			int posicion = 0;
			while(posicion < pos && buscado != null)
			{
				buscado = buscado.getSiguiente();
				posicion++;
		
			}
			
			return buscado;
	 }
	 
/////////////////////////////////////////////////////////////////	
	 public void insertarOrdenado(int e) {
		 
		if(estaOrdenada()==true){
			boolean listo=false;
			NodoInt n=this.primero;
			 while(n!=null && !listo){
			 if(e<=n.elemento ){
				this.agregarEnPosicion(this.saberPos(n.elemento),e);
				listo=true;
			 }
		 n=n.siguiente;
			 }
		}
	 }
	 public int saberPos(int elem){
		int pos=0; int i=0;
		NodoInt n=this.primero;
		while(n!=null){
			if(n.elemento==elem){
				pos=i;
			}
			i++;
			n=n.siguiente;
		}
		 return pos;
	 }
/////////////////////////////////////////////////////////////////	
	
/////////////////////////////////////////////////////////////////
		public ListaInt buscarTodos(int x){
			ListaInt nueva=new ListaInt();
			int i=0;
			NodoInt n=this.primero;
			while(n!=null){
				if(n.elemento==x){
				nueva.agregarAtras(i);
				
				}
				i++;
				n=n.siguiente;
			}
			nueva.ordenar();
			return nueva;
		}
		
/////////////////////////////////////////////////////////////////
	 public void anexar(ListaInt otra){
		 NodoInt n=otra.primero;
		 while(n!=null){
			 this.agregarAtras(n.elemento);
			 n=n.siguiente;
		 }
	 }		
/////////////////////////////////////////////////////////////////
 public static ListaInt concatenar(ListaInt l1, ListaInt l2)
		{
			ListaInt concatenada = l1;
			concatenada.anexar(l2);
			
			return concatenada;
		}	 
/////////////////////////////////////////////////////////////////
 public ListaInt reversa(){
	 ListaInt nueva=new ListaInt();
	 NodoInt n=this.primero;
	 while(n!=null){
		 nueva.agregarAdelante(n.elemento);
		 n=n.siguiente;
	 }
	 return nueva;
 }
/////////////////////////////////////////////////////////////////
 public static ListaInt combinarListasOrdenadas(ListaInt l1, ListaInt l2) {
	 ListaInt nueva=new ListaInt();
	 if(l1.estaOrdenada() && l2.estaOrdenada()) {
		 nueva=concatenar(l1,l2);
	 }
	 
	 nueva.ordenar();
	 return nueva;
 }
/////////////////////////////////////////////////////////////////
 
/////////////////////////////////////////////////////////////////
	 public void quitar(int x) {
		  if (this.primero != null && this.primero.elemento == x) {//compara si es el elemento buscado
			  this.primero = this.primero.siguiente;
		 return;
		  }
		 NodoInt actual = this.primero, prev = null;
		 	while (actual != null && actual.elemento != x) {
		 			actual = (prev = actual).siguiente;
		 }
		  if (actual != null) {
			  prev.siguiente = actual.siguiente;
		 }
	 }

	
	void quitarTodos(int x){
		  if (this.primero != null && this.primero.elemento == x) {//compara si es el elemento buscado
			 quitar(x);
			  
		  }
	}
	

	void quitarPrimero(){
		this.primero=this.primero.siguiente;
	}
	int primero(){
		return this.primero.elemento;
		
	}
	public void quitarAtras() {
		NodoInt n=this.primero;
		while(n!=null) {
		if(n.siguiente==null) {
			quitar(n.elemento);
		}
		n=n.siguiente;
		}
	}
		
	
	public int obtenerAtras() {
		int elem=0;
		NodoInt n=this.primero;
		while(n!=null) {
		if(n.siguiente==null){
		 elem=n.elemento;
		}
		n=n.siguiente;
		}
		return elem;
	}


}
	

