package Genericos;

public class Par<k, v> {
	
	protected k chave;
	protected v valor;
	
	public Par(k chave, v valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public void exibir() {
		System.out.println("Chave: "+this.chave+" | " + "Valor: "+this.valor);
	}
	
}
