package Principal;

public class CartaoCred implements PayFlex{

	
	protected double valor;
	
	
	public CartaoCred(double valor) {
		this.valor = valor;
	}
	
	public void processarPagamento() {
		autenticar();
		System.out.println("Pagamento de R$" + valor + " realizado via cartão de crédito.");
		emitirComprovante();
		
	}

	@Override
	public void autenticar() {
		System.out.println("Autenticando Cartão de Crédito...");
	}

	@Override
	public void emitirComprovante() {
		System.out.println("Comprovante Impresso!");
		
	}
}
