
public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double altura, double base) {
		super(altura, base);
		
	}

	@Override
	public double area() {
		
		return super.getAltura() * super.getBase();
	}

	@Override
	public double CalcDiag() {
		
		return Math.sqrt(Math.pow(super.getAltura(), 2) + Math.pow(super.getBase(), 2));
	}

	@Override
	public double perimetro() {
	
		return 2*super.getBase() + 2*super.getAltura();
	}

	@Override
	public String toString() {
		return "Retangulo [area()=" + area() + ", CalcDiag()=" + CalcDiag() + ", perimetro()=" + perimetro() + "]";
	}
	
}
