package Principal;

public class Boleto implements PayFlex {
	
	
	protected double valor;

	public Boleto(double valor) {
		this.valor = valor;
	}
	
	public void processarPagamento() {
		System.out.println("Gerando boleto no valor de R$" + valor);
		emitirComprovante();
	}

	@Override
	public void autenticar() {
		System.out.println("");
	}
;
	@Override
	public void emitirComprovante() {
		System.out.println("Aguardando compensação bancária.");
		
	}

}
