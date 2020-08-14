
public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaEnlazadaInt pila=new PilaEnlazadaInt();
		PilaIntConListaEnlazada pilaE=new PilaIntConListaEnlazada();
		pila.apilar(1);
		pila.apilar(2);
		pila.apilar(3);
		pila.apilar(4);
		pila.imprimir();
		System.out.println("ultimo elemento: "+pila.tope());
		System.out.print("desapilar: ");pila.desapilar();
		pila.imprimir();
		
		pilaE.apilar(5);
		pilaE.apilar(6);
		pilaE.apilar(7);
		pilaE.imprimir();
		System.out.println("ultimo elemento: "+pilaE.tope());
		System.out.print("desapilar: ");pilaE.desapilar();
		pilaE.imprimir();
		
		PilaIntConArreglo arreglo=new PilaIntConArreglo();
		arreglo.apilar(1);
		arreglo.apilar(2);
		arreglo.apilar(3);
		arreglo.imprimir();
		System.out.println("ultimo elemento: del arreglo: "+arreglo.tope());
		
		System.out.println();
		
		Arbol arbol=new Arbol();
		MiEntero a=new MiEntero(10);
		MiEntero b=new MiEntero(15);
		MiEntero c=new MiEntero(8);
		MiEntero d=new MiEntero(2);
		MiEntero e=new MiEntero(7);
		MiEntero f=new MiEntero(9);
		arbol.insertar(a);
		arbol.insertar(b);
		arbol.insertar(c);
		arbol.insertar(d);
		arbol.insertar(e);
		arbol.insertar(f);
		System.out.println("factor de equilibrio: "+arbol.factorDeEquilibrio());
		System.out.println("profundidad: "+arbol.profundidad());
		System.out.println("maximo: "+arbol.maximo());
		System.out.println("minimo: "+arbol.minimo());
		System.out.print("inorden: ");arbol.recorrerInOrden();
		System.out.println();
		System.out.print("preorden:");arbol.recorrerPreOrden();
		System.out.println();
		System.out.print("posorden");arbol.recorrerPostOrden();
		System.out.println();
		
		
		Fecha f1=new Fecha(9,10,1995);
		ElementoComparable e1=new Persona("Ignacio",f1);
		Fecha f2=new Fecha(19,12,1995);
		ElementoComparable e2=new Persona("deby",f2);
		Fecha f3=new Fecha(14,8,2018);
		ElementoComparable e3=new Persona("El",f3);
		System.out.println(e1.mayorIgualQue(e2));
		System.out.println(e2.menorIgualQue(e3));
		
		Arbol a1=new Arbol();
		a1.insertar(e1);
		a1.insertar(e2);
		a1.insertar(e3);
		System.out.println(a1.profundidad());
		System.out.println(a1.maximo());
		
		
	}

}
