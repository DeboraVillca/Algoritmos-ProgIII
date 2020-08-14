
public class Arbol  {
	private NodoArbol raiz;

	public Arbol(ElementoComparable valor) {
		// TODO Auto-generated constructor stub
		this.raiz=new NodoArbol(valor);
	}
	public Arbol() {
		// TODO Auto-generated constructor stub
	}
	public void insertar(ElementoComparable elemento) {
		if(this.raiz==null) {
			NodoArbol nuevo=new NodoArbol(elemento);//si no hay nada lo hace raiz 
			this.raiz=nuevo;
		}else {
			this.insertar(this.raiz,elemento);{ //si ya hay algo llama a insertar 
				
			}
		}
	}

	private void insertar(NodoArbol nodo, ElementoComparable elemento) {
		// TODO Auto-generated method stub
		if(elemento.menorQue(nodo.getElemento())) {//si el elemento es menor al nodo
			if(nodo.getHijo_izquierdo()!=null) {//evalua x lado izquierdo 
				this.insertar(nodo.getHijo_izquierdo(),elemento);//llamada recursiva 
			}else {
				NodoArbol nuevo= new NodoArbol(elemento);//sino lo crea y agrega
				nodo.setHijo_izquierdo(nuevo);
			}
		}else {//si no es menor al nodo entra lado derecho
			if(nodo.getHijo_derecho()!=null) {//si ya hay algo 
				this.insertar(nodo.getHijo_derecho(),elemento);//llamada recursiva 
			}else {
				NodoArbol nuevo= new NodoArbol(elemento);
				nodo.setHijo_derecho(nuevo);
			}
		}
	}
	////////////////////////////////////////
	public void recorrerPreOrden() {
		recorrerPreOrden(raiz);
	}
	private void recorrerPreOrden(NodoArbol nodo) {
		// TODO Auto-generated method stub
		if(nodo!=null) {
			tratar(nodo);
			recorrerPreOrden(nodo.getHijo_izquierdo());
			recorrerPreOrden(nodo.getHijo_derecho());
		}
		
	}
	////////////////////////////////////////////
	public void recorrerInOrden() {
		recorrerInOrden(raiz);
	}
	private void recorrerInOrden(NodoArbol nodo) {
		// TODO Auto-generated method stub
		if(nodo!=null) {
			
			recorrerPreOrden(nodo.getHijo_izquierdo());
			nodo.tratar();
			recorrerPreOrden(nodo.getHijo_derecho());
			}
		}
	////////////////////////////////////////////////////
		public void recorrerPostOrden() {
			recorrerInOrden(raiz);
		}
		private void recorrerPostOrden(NodoArbol nodo) {
			// TODO Auto-generated method stub
			if(nodo!=null) {
				
				recorrerPreOrden(nodo.getHijo_izquierdo());
				nodo.tratar();
				recorrerPreOrden(nodo.getHijo_derecho());
			}
		
	}
	////////////////////////////////////////
		public int profundidad() {
			return profundidad(raiz);
		}
		private int profundidad(NodoArbol nodo) {
			if(nodo!=null) {
				return elegirMayor(profundidad(nodo.getHijo_izquierdo()),profundidad(nodo.getHijo_derecho()))+1;
			}else
			return 0;	
		}
	private int elegirMayor(int a,int b) {
		int m=0;
		if(a>b) {
			m=a;
		}else {
			m=b;
		}
		return m;
	}
////////////////////////////////////////

////////////////////////////////////////
	public int factorDeEquilibrio() {
		return equilibrar(raiz);						
	}													
private int equilibrar(NodoArbol nodo) {	
		int resto=0;										
	if(nodo!=null) {								
	resto=profundidad(nodo.getHijo_izquierdo())-profundidad(nodo.getHijo_derecho());
	}												
	return resto;
}
////////////////////////////////////////
public boolean buscar(ElementoComparable e) {
	NodoArbol n=raiz;
	while(n!=null) {
		if(n==e) {
			return true;
		}
		n=n.getHijo_izquierdo();
		if(n==e) {
			return true;
		}
		n=n.getHijo_derecho();
	}
		return false;
}
////////////////////////////////////////
public ElementoComparable minimo() {
	ElementoComparable minimo=null;
	NodoArbol n=raiz;
	while(n!=null) {
		minimo=n.getElemento();
		n=n.getHijo_izquierdo();
	}
	return minimo;
}
////////////////////////////////////////
public ElementoComparable maximo() {
	ElementoComparable maximo=null;
	NodoArbol n=raiz;
	while(n!=null) {
		maximo=n.getElemento();
		n=n.getHijo_derecho();
	}
	return maximo;
}
////////////////////////////////////////
private void tratar(NodoArbol nodo) {

if(nodo!=null) {
	System.out.print(nodo.getElemento()+" ");
}
}


}
