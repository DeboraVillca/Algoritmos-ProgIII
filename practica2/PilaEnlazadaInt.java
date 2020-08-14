
public class PilaEnlazadaInt implements PilaInt {
	private ListaInt Lista;
	private NodoInt primero;
	public PilaEnlazadaInt() {
		this.Lista=new ListaInt();
	}
	@Override
	public void apilar(int n) {
		// TODO Auto-generated method stub
		this.Lista.agregarAtras(n);
	}

	@Override
	public void desapilar() {
		// TODO Auto-generated method stub
		this.Lista.quitarAtras();
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return (this.Lista.largo()==0);
	}

	@Override
	public int tope() {
		// TODO Auto-generated method stub
		if(this.estaVacia()) {
			throw new RuntimeException("la pila esta vacia ");
		}
	return this.Lista.obtenerAtras();
	
	}
	public void imprimir() {
		this.Lista.imprimir();
	}

}
