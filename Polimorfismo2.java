package aula02;

public class Relogio {
	
	public void horaLocal() {	
	}

}

package aula02;

public class RelogioJapao extends Relogio {
	
	protected int horarioBrasil;
	
	public void horaLocal() {
		System.out.println("A hora local do Japão é: " + (horarioBrasil + 12) + "h");
	}
	
}
package aula02;

public class RelogioNw {
	
	protected int horarioBrasil;
		
	public void horaLocal() {
		System.out.println("A hora local do EUA é: " + (horarioBrasil - 1) + "h");
	}
}

package aula02;

public class Main {

	public static void main(String[] args) {
	
		RelogioJapao r1 = new RelogioJapao();
		r1.horarioBrasil = 5;
		r1.horaLocal();
		
		RelogioNw r2 = new RelogioNw();		
		r2.horarioBrasil = 5;
		r2.horaLocal();
		
		
	}
	
}
