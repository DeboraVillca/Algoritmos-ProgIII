
public class MiEntero implements ElementoComparable {
private int entero;
	public MiEntero(int entero) {
		// TODO Auto-generated constructor stub
	this.entero=entero;
	}

	@Override
	public boolean igualQue(ElementoComparable otro) {
		// TODO Auto-generated method stub
		MiEntero otroEntero=(MiEntero) otro;
		return otroEntero.entero==this.entero;
	}

	@Override
	public boolean menorQue(ElementoComparable otro) {
		MiEntero otroEntero=(MiEntero) otro;
		return this.entero<otroEntero.entero;
	}

	@Override
	public boolean menorIgualQue(ElementoComparable otro) {
		MiEntero otroEntero=(MiEntero) otro;
		return this.entero<=otroEntero.entero;
	}

	@Override
	public boolean mayorQue(ElementoComparable otro) {
		MiEntero otroEntero=(MiEntero) otro;
		return this.entero>otroEntero.entero;
	}

	@Override
	public boolean mayorIgualQue(ElementoComparable otro) {
		MiEntero otroEntero=(MiEntero) otro;
		return this.entero>=otroEntero.entero;
	}

	@Override
	public String toString() {
		return "" + entero + "";
	}

}
