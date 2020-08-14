
public class NodoArbol {
	
	private ElementoComparable elemento;
	private NodoArbol hijo_izquierdo;
	private NodoArbol hijo_derecho;

	public NodoArbol(ElementoComparable elemento) {
		// TODO Auto-generated constructor stub
		this.elemento=elemento;
		this.hijo_derecho=null;
		this.hijo_izquierdo=null;
	}

	public ElementoComparable getElemento() {
		// TODO Auto-generated method stub
		return elemento;
	}
	public void setElemento(ElementoComparable elemento) {
		this.elemento = elemento;
	}
	public NodoArbol getHijo_izquierdo() {
		// TODO Auto-generated method stub
		return hijo_izquierdo;
	}
	public void setHijo_izquierdo(NodoArbol hijo_izquierdo) {
		this.hijo_izquierdo = hijo_izquierdo;
	}
	public NodoArbol getHijo_derecho() {
		return hijo_derecho;
	}

	public void setHijo_derecho(NodoArbol hijo_derecho) {
		this.hijo_derecho = hijo_derecho;
	}
	
	
	public void tratar()
	{
		System.out.print(this.elemento+ " ");
	}
	

}