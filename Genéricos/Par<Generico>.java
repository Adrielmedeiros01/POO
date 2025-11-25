package aula2511;

public class Par<G> {
	
	protected G primeiro;
	protected G segundo;
	
	
	public Par(G primeiro, G segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	
	
	public G getPrimeiro() {
		return primeiro;
	}
	
	
	public G getSegundo() {
		return segundo;
	}
}
