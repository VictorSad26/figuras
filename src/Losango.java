
public class Losango extends Poligono {

	public Losango(double altura, double base) {
		super(altura, base);
		
	}

	@Override
	public double area() {
		
		return super.getAltura() * super.getBase();
	}

	@Override
	public double perimetro() {
	
		return 4*super.getBase();
	}

	@Override
	public String toString() {
		return "Losango [area()=" + area() + ", perimetro()=" + perimetro() + "]";
	}
	
}
