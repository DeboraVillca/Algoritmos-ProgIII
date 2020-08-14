
public class PilaIntConListaEnlazada implements PilaInt {

	private ListaInt lista;
	PilaIntConListaEnlazada(){
		this.lista = new ListaInt();
}
	
	@Override
	public void apilar(int n) {
		// TODO Auto-generated method stub
		this.lista.agregarAdelante(n);
	}

	@Override
	public void desapilar() {
		this.lista.quitarPrimero();

	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return (this.lista.estaVacia());
	}

	@Override
	public int tope() {
		// TODO Auto-generated method stub
		return this.lista.primero();
	}
	public void imprimir() {
		 this.lista.imprimir();
	}
}
