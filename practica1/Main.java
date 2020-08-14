import java.util.*;
public class Main {


	public static void main(String[] args) {
		Fraccion f=new Fraccion(23,2);
		Fraccion f1=new Fraccion(2,2);
		f.imprimir();
		f1.imprimir();
		System.out.print("invertir signo:");
		f.invertirSigno();
		System.out.print("invertir");
		f.invertir();
		System.out.println(f.aDouble());
		System.out.print("producto: ");
		Fraccion f3= Fraccion.producto(f, f1);
		f3.imprimir();
		System.out.print("suma: ");
		Fraccion f4=Fraccion.suma(f,f1);
		f4.imprimir();
////////////////////////////////////////////
		Punto p=new Punto(2,4);
		p.imprimir();
		p.desplazar(2, 2);
		p.imprimir();
		Punto p1=new Punto(3,1);
		System.out.println(p.distancia(p, p1));
////////////////////////////////////////////////
		Circulo c= new Circulo(2,3,1);
		c.imprimir();
		System.out.println(c.perimetro());
		System.out.println(c.superficie());
		c.escalar(0);
		c.imprimir();
		Circulo c1=new Circulo(2,2,2);
		c1.imprimir();
		c.distancia(c, c1);
		System.out.println(c.seTocan(c, c1));
		System.out.println(c.loContiene(c1));
		System.out.println();
	
	/////////////////////////////////////////////////////
	Fecha fnac=new Fecha(9,10,1995);
	Fecha fnac2=new Fecha(19,12,1995);
	Fecha fnac3=new Fecha(1,2,2000);
	Persona persona= new Persona( "Ignacio",fnac); 
	Persona persona1=new Persona("deby",fnac2);
	Persona persona2=new Persona("sol",fnac3);
	
	
	String j ="persona "+persona;
	System.out.println(j);
	System.out.println("mas joven que: "+persona1.masJovenQue(persona));
	System.out.println("tocayo: "+persona.tocayo(persona));
	System.out.println("mismaPersona :"+persona.mismaPersona(persona));
	
	Persona grupo[]=new Persona[3];
	grupo[0]=persona;
	grupo[1]=persona1;
	grupo[2]=persona2;
	System.out.println("persona mas joven :"+Persona.masJoven(grupo));
	System.out.println("persona a buscar :"+Persona.buscar(grupo, "Ignacio"));
	
	//////////////////////////////////////////////////
	int[] valor = {1,2,3,4,5,7};
	int[] valor2 = new int[0];	
	Arreglos arreglo = new Arreglos(valor2);
	System.out.println(arreglo.esSinRepetidos(valor));
	int[] a = {1,2,3,3};
	int[] b = {4,5,7};
	int [] nuevo = arreglo.pegar(a, b);
	for (int k = 0; k < nuevo.length; k++) {
		System.out.print(nuevo[k]+",");		
	}
	System.out.println();
	int[] nuevo1=arreglo.agregarAlFinal(a,8);
	for (int l = 0; l< nuevo1.length; l++) {
		System.out.print(nuevo1[l]+",");		
	}
	System.out.println();	
	arreglo.invertir(b);
	System.out.println();
	//////////////////////////////////////////////////////
	Agenda agenda =new Agenda(3);
	agenda.guardar(persona,"123456");
	agenda.guardar(persona1,"7891011");
	agenda.guardar(persona2,"12131415");
	agenda.imprimir();
	agenda.eliminar(persona);
	System.out.println();
	agenda.imprimir();
	System.out.println("pertenece :"+agenda.pertenece(persona1));
	System.out.println("telefono :"+agenda.dameTelefono(persona1));
	
	//////////////////////////////////////////////////////////////////
	
	
	Conjunto conjunto=new Conjunto();
	conjunto.agregar(1);
	conjunto.agregar(2);
	conjunto.agregar(2);
	conjunto.imprimir();
	System.out.println("El numero pertenece: "+conjunto.pertenece(4));
	conjunto.quitar(2);
	conjunto.imprimir();
	
	
	Conjunto conjunto1=new Conjunto();
	conjunto1.agregar(3);
	conjunto1.agregar(4);
	conjunto1.imprimir();
	Conjunto conjunto2=new Conjunto();
	conjunto2.agregar(5);
	conjunto2.agregar(6);
	conjunto2.agregar(4);
	conjunto2.imprimir();
	Conjunto conjunto3= Conjunto.union(conjunto1, conjunto2);

	Conjunto conjunto4=Conjunto.interseccion(conjunto1, conjunto2);
	conjunto4.imprimir();
	
	Conjunto conjunto5=Conjunto.resta(conjunto1, conjunto2);
	conjunto5.imprimir();
	
	conjunto2.restar(conjunto1);
	conjunto2.imprimir();
	
	
	}

}
