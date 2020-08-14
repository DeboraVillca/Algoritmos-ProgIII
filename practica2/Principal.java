
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaInt lst=new ListaInt();
		lst.agregarAdelante(4);
		lst.agregarAdelante(3);
		lst.agregarAdelante(2);
		lst.agregarAdelante(1);
		lst.agregarAtras(5);
		lst.imprimir();
		System.out.println("largo: "+lst.largo());
		System.out.println("vacia: "+lst.estaVacia());
		System.out.println("suma: "+lst.suma());
		System.out.println("promedio: "+lst.promedio());
		System.out.println("nodo iesimo: "+lst.iesimo(2));
		System.out.println("buscar: "+lst.buscar(4));
		System.out.println("maximo: "+lst.maximo());
		System.out.println("esta ordenada :"+lst.estaOrdenada());
		System.out.print("ordenar");lst.ordenar(); lst.imprimir();
		System.out.print("insertar ordenado: ");lst.insertarOrdenado(3);lst.imprimir();
		System.out.print("rotar derecha: ");lst.rotarDerecha();lst.imprimir();
		System.out.print("agregar en posicion: ");lst.agregarEnPosicion(2,2);lst.imprimir();
	
		ListaInt lst1=new ListaInt();
		lst1.agregarAdelante(9);
		lst1.agregarAdelante(8);
		lst1.agregarAdelante(7);
		lst1.agregarAdelante(6);lst1.imprimir();
		ListaInt s=new ListaInt();
		s.agregarAdelante(12);
		s.agregarAdelante(11);
		s.agregarAdelante(10);
		s.agregarAtras(13);s.imprimir();
		System.out.print("interc ordenado");ListaInt l=lst1.combinarListasOrdenadas(s,lst1);l.imprimir();
		System.out.print("buscar todas las pos: ");ListaInt ls=lst.buscarTodos(2);ls.imprimir();
		System.out.print("anexar: ");lst.anexar(lst1);lst.imprimir();
		System.out.print("concatenar: ");ListaInt ls1=lst1.concatenar(lst1, ls);ls1.imprimir();
		System.out.print("reversa: ");ListaInt ls2=ls.reversa();ls2.imprimir();
		
		
		
	}

}
