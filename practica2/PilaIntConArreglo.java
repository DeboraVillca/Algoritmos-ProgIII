
public class PilaIntConArreglo implements PilaInt {
private int[] elementos;
private int tope;
public PilaIntConArreglo() {
	this.elementos = new int[0];
	this.tope=0;	
}
	@Override
	public void apilar(int n) {
		// TODO Auto-generated method stub
		int[] nueva=new int[elementos.length+1];
		int j=0;
		nueva[0]=n;
		for(int i=0;i<elementos.length;i++) {
			 j=i+1;
			nueva[j]=this.elementos[i];
		}
		this.elementos=nueva;
		this.tope=nueva.length-1;
	}
	public void imprimir() {
		System.out.print("[");
		for(int i=0;i<elementos.length;i++) {
			System.out.print(this.elementos[i]+ " ");
		}
		System.out.println("]");
	}

	@Override
	public void desapilar() {
		// TODO Auto-generated method stub
		int[] nueva=new int[elementos.length-1];
		for(int i=0;i<nueva.length;i++) {
			nueva[i]=this.elementos[i+1];
		}
		this.elementos=nueva;
		this.tope=nueva.length-1;

	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return (this.elementos.length==0);
	}

	@Override
	public int tope() {
		// TODO Auto-generated method stub
		if(this.estaVacia()) {
			throw new RuntimeException("la pila esta vacia ");
			}
		return this.elementos[this.tope];
	}

}
