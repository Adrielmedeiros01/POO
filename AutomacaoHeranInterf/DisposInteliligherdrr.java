package Principal;



public class DispIntelig implements BotaoPower {
	
	protected boolean ligada;
	

	@Override
	public void on() {
		
		if(!ligada) {
			ligada = true;
			System.out.println("Ligando todos os dispositivos!");
	
		}	
		else {
			System.out.println("Os dispositivos já estão Ligados!");
		}
	}

	@Override
	public void off() {
		if(ligada) {
			ligada = false;
			System.out.println("Desligando todos os dispositivos!");
		}
		else {	
			System.out.println("Os dispositivos já estão desigados!");
		}
			
	}
	
	public void status() {
		System.out.println("Verificando status...");
		
		if(ligada) {
			System.out.println("A Lampada foi ligada!");
			System.out.println("A Porta foi aberda!");
			System.out.println("O aspirador foi ligado!");
		}
		else {
			System.out.println("A Lampada foi desligada!");
			System.out.println("A Porta foi fechada!");
			System.out.println("O aspirador foi deligado!");
		}
	}

}
