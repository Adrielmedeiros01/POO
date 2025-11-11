package Q2;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Computador c1 = new Computador();
		Smartphone s1 = new Smartphone();
		SmartTv stv1 = new SmartTv();
		
		ArrayList<Conectavel> conectavel = new ArrayList<>();
		
		conectavel.add(c1);
		conectavel.add(s1);
		conectavel.add(stv1);
		
		
		for(Conectavel c : conectavel) {
			c.conectar();
		}		
		
	}

}
