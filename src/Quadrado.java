
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double lado) {
		super(lado,lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() { //subescrevi o metodo area da classe figura
		
		return super.getAltura() * super.getBase();
	}

	@Override
	public double CalcDiag() {
		
		return super.getAltura() * Math.sqrt(2);
	}
	
	@Override
	public double perimetro() {
	
		return 4*super.getBase();
	}

	@Override
	public String toString() {
		return "Quadrado [area()=" + area() + ", CalcDiag()=" + CalcDiag() + ", perimetro()=" + perimetro() + "]";
	}

}
