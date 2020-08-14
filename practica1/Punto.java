
public class Punto {
		double x;
		 double y;
		 Punto(){
			 x=0;
			 y=0;
		 }

Punto(double x, double y){
		this.x=x;
		this.y=y;
	}

void imprimir() {
	System.out.println("valor de x "+this.x+" valor de y "+this.y);
}
void desplazar(double desp_x, double desp_y)
{
	this.x=x+desp_x;
	this.y=y+desp_y;
}
static double distancia(Punto p, Punto p1){
	double dist=0;
	dist=Math.sqrt(((p.x-p1.x)*(p.x-p1.x)) + ((p.y-p1.y)*(p.y-p1.y)));
	return dist;

	
}
}
