package Principal;

public class Aspirador extends DispIntelig implements BotaoPower {
	
	public Aspirador() {
		 ligada = false;
	}
	
	@Override
	public void on() {
		
		if(ligada) {
			System.out.println("O aspirador já está ligado");
		}	
		else {
			ligada = true;
			System.out.println("O aspirador está ligado");
		}
	}

	@Override
	public void off() {
		if(!ligada) {
			System.out.println("O aspirador já esta desligado!");
		}
		else {
			ligada = false;
			System.out.println("O aspirador foi desligada!");
		}
		
	}

}
