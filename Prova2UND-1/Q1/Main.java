package Q1;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		Gato g1 = new Gato();
		Gato g2 = new Gato();
	
		ArrayList<Animal> animal  = new ArrayList<>();
		
		animal.add(c1);
		animal.add(c2);
		animal.add(c1);
		animal.add(g1);
		animal.add(g2);	
		
		for(Animal a : animal) {
			a.emitirSom();
		}	
		
	}
	
}
