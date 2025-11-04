package Principal;

public class Lampada extends DispIntelig implements BotaoPower{
	
	
	public Lampada() {
		 ligada = false;
	}
	
	@Override
	public void on() {
		
		if(ligada) {
			System.out.println("A Lampada já está acesa!");
		}	
		else {
			ligada = true;
			System.out.println("A Lampada foi ligada!");
		}
	}

	@Override
	public void off() {
		if(!ligada) {
			System.out.println("A Lampada já está desligada!");
		}
		else {
			ligada = false;
			System.out.println("A Lampada foi desligada!");
		}
		
	}
	
	

	
}
