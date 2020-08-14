import unpaz.ayp3.*;
public class Ejer27 {

	public static void main(String[] args) {
		int numero=0;
		numero=Consola.pedirEntero();
		collatz(numero);
	}
static void collatz(int n) {
		
		if (n==1)
				System.out.println(" 1 fin");
		else {
			if(n%2==0){
				System.out.print(" "+n);
				n = n/2;
				collatz(n);
			}
			else {
				System.out.print(" "+n);
				n = (3*n)+1;
				collatz(n);
			}
				
		}
	}
}
