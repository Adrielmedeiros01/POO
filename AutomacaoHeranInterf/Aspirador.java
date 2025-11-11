package Principal;

public class Aspirador extends DispIntelig implements BotaoPower {
	
	private String marca;
	private double bateria;
	
	public Aspirador() {
		 super();
		 ligada = false;
		 this.marca = "Xiaomi";
		 this.bateria = 75.0;
	}
	
	public void inforAspir() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Bateria: " + this.bateria + "%");
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
