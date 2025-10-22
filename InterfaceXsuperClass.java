package interfac;

public interface Controle {
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void aumentar();
	public abstract void diminuir();
	
}


package interfac;

public class Televisao implements Controle {
	
	
	
	public boolean on;
	public int volume;
	
	public Televisao() {
		this.on = true;
		this.volume = 50;
	}
	
	@Override
	public void ligar() {
		
		if (!on) {
			this.on = true;
			System.out.println("A TV está ligada!");
		}
		
		else {
			System.out.println("A TV já está ligada!");
		}
	
	}

	@Override
	public void desligar() {
		if (on) {
			this.on = false;
			System.out.println("A TV foi desligada!");
		}
		else {
			System.out.println("A TV já está desligada!");
		}
	
	}

	@Override
	public void aumentar() {
		if(on) {
			this.volume = volume + 5;
			System.out.println("Volume atual: "+ this.volume);
		}
		else {
			System.out.println("A TV está desligada!");
		}
	}

	@Override
	public void diminuir() {
		if(on) {
			this.volume = volume - 5;
			System.out.println("Volume atual: "+ this.volume);
		}
		
		else {
			System.out.println("A TV está desligada!");
		}
		
	}
	
	

}

package interfac;

public class Control {
	
	public void ligar() {
	}
	
	public void desligar() {
	}

	public void aumentar() {
	}
	
	public void diminuir() {
	}

}
package interfac;

public class ArCondicionado extends Control {
	
	
	public boolean on;
	public int temperatura;
	
	public ArCondicionado() {
		this.on = true;
		this.temperatura = 50;
	}
	
	@Override
	public void ligar() {
		
		if (!on) {
			this.on = true;
			System.out.println("O ar está ligado!");
		}
		
		else {
			System.out.println("O ar já está ligado!");
		}
	
	}

	@Override
	public void desligar() {
		if (on) {
			this.on = false;
			System.out.println("O ar foi desligado!");
		}
		else {
			System.out.println("O ar já está desligado!");
		}
	
	}

	@Override
	public void aumentar() {
		if(on) {
			this.temperatura = temperatura + 5;
			System.out.println("Temperatura atual: "+ this.temperatura);
		}
		else {
			System.out.println("O ar está desligado!");
		}
	}

	@Override
	public void diminuir() {
		if(on) {
			this.temperatura = temperatura - 5;
			System.out.println("Temperatura atual: "+ this.temperatura);
		}
		
		else {
			System.out.println("O ar está desligado!");
		}
		
	}

}


package interfac;

public class Main {

	public static void main(String[] args) {
	
		Televisao t1 = new Televisao();
		t1.desligar();
		t1.ligar();
		t1.ligar();
		t1.aumentar();
		t1.aumentar();
		t1.diminuir();
		t1.desligar();
		t1.desligar();
		
		System.out.println();
		System.out.println();
		
		ArCondicionado a1 = new ArCondicionado();
		a1.desligar();
		a1.ligar();
		a1.ligar();
		a1.aumentar();
		a1.aumentar();
		a1.diminuir();
		a1.desligar();
		a1.desligar();

	
		
	}
}

