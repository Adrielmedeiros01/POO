package Principal;

public class Porta extends DispIntelig implements BotaoPower {
	
	
	public Porta() {
		 ligada = false;
	}
	
	@Override
	public void on() {
		
		if(ligada) {
			System.out.println("A porta já está aberta!");
		}	
		else {
			ligada = true;
			System.out.println("A porta foi aberta!");
		}
	}

	@Override
	public void off() {
		if(!ligada) {
			System.out.println("A porta já está fechada!");
		}
		else {
			ligada = false;
			System.out.println("A porta foi fechada!");
		}
		
	}

}
