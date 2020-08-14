
public class Circulo {
	double radio;
	Punto centro;
	public Circulo(double centro_x, double centro_y, double radio){
		this.radio=radio;
		this.centro =new Punto(centro_x,centro_y);
	}
	void imprimir() {
		System.out.println("es el radio "+this.radio);
		System.out.println("este el centro x "+this.centro.x+"  y "+this.centro.y);
	}
	double perimetro(){
		double per=2*Math.PI*this.radio;
		return per;
	}
	double superficie() {
		double su=0;
		su=3.1416 * Math.pow(this.radio,2);
		return su;
	}
	void escalar(double factor){
		this.radio=this.radio+factor;
	}
	void desplazar(double desp_x, double desp_y){
		this.centro=new Punto(this.centro.x+desp_x,this.centro.y+desp_y);
	}
	
	static double distancia(Circulo c1, Circulo c2){
		double distancia=0;
		double p = Punto.distancia(c1.centro, c2.centro); //define los dos puntos
		
	 distancia = p - (c1.radio + c2.radio); //a los puntos le resto los radios 
		return distancia;//resultado distancia de los dos circulos
	}
	static boolean seTocan(Circulo c1, Circulo c2){
		
		if((Circulo.distancia(c1, c2))<=0)
			return true;
		else
		return false;
	}
	boolean loContiene(Circulo otro){
		if(otro.radio<this.radio){// si otro radio es menor del radio actual 
			if(Punto.distancia(this.centro,otro.centro)+otro.radio<=this.radio)//si la suma de distancia con el radio actual  	
				return true;													//es menor que es radio actual 
			else
				return false;
			}
			else
				if(Punto.distancia(this.centro,otro.centro)+this.radio<=otro.radio)	
					return true;
				else
					return false;
	}
}
