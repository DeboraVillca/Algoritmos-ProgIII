public class NodoInt {
	
	 public int elemento;
	 public NodoInt siguiente;
	 public NodoInt anterior;
		public NodoInt(int elemento) {
		
			this.siguiente = null;
			this.elemento = elemento;
			this.anterior=null;
		}
		
		public NodoInt getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(NodoInt siguiente) {
			this.siguiente = siguiente;
		}
		public int getElemento() {
			return elemento;
		}
		public void setElemento(int elemento) {
			this.elemento = elemento;
		}
		public NodoInt getAnterior() {
			return anterior;
		}
		public void setAnterior(NodoInt anterior) {
			this.anterior = anterior;
		}
		
}

