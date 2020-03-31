import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> lista = new ArrayList<Figura>();
		
		Figura circ = new Circulo(8);
		lista.add(circ);
		lista.add(new Losango(5,27));
		lista.add(new Quadrado(8));
		lista.add(new Retangulo(76,55));
		lista.add(new Triangulo(26,77));
		
		
		for(Figura fig : lista) {
		System.out.println(fig);
		
		}

	}

}
