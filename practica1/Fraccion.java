
public class Fraccion {

	int numerador;
	int denominador;
 public Fraccion(int numerador,int denominador){
	 this.numerador=numerador;
	 this.denominador=denominador;
 }
void imprimir() {
	 System.out.println(this.numerador+" / "+this.denominador);
 }
void invertirSigno()
{
	if(this.numerador<0 || this.denominador<0){
		this.numerador=this.numerador*-1;
		this.denominador=this.denominador*-1;
		
	}else{
		this.numerador=this.numerador*-1;
		this.denominador=this.denominador*-1;
	}
	System.out.println(this.numerador+"/ "+this.denominador);
	}
void invertir() {
	int num=this.numerador;
	this.numerador=this.denominador;
	this.denominador=num;
	System.out.println(this.numerador+"/"+this.denominador);
}
double aDouble(){
	double val=this.denominador;
	double val1=this.numerador;
	return val;
}
static Fraccion producto(Fraccion q1, Fraccion q2){
	
	
	int numeros=q1.numerador*q2.numerador;
	int numeros1=q1.denominador*q2.denominador;
	Fraccion fraccionNueva = new Fraccion(numeros,numeros1);
	return fraccionNueva;
	
	
}
 static Fraccion suma(Fraccion q1, Fraccion q2) {
	 int den = q1.denominador * q2.denominador;
		int val1 = den / q1.denominador;
		int val2 = den / q2.denominador;
		int val3 = val1 * q1.numerador;
		int val4 = val2 * q2.numerador;
		int num = val3+val4;
		
		Fraccion fraccionNueva = new Fraccion(num,den);
		
		return fraccionNueva;
}
}
