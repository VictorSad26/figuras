
public class Triangulo extends Poligono {

	public Triangulo(double altura, double base) {
		super(altura, base);
		
	}

	@Override
	public double area() {
		
		return super.getAltura() * super.getBase()/2;
	}

	@Override
	public double perimetro() {
	
		double cateto = super.getBase()/2;
		double hipotenusa = Math.pow(super.getAltura(), 2) + Math.pow(cateto,2);
		double lado = Math.sqrt(hipotenusa);
		
		return super.getBase()*lado + super.getBase()*lado + lado * lado;
	}

}
