package Principal;

public class Pix implements PayFlex{
	
	protected double valor;
	
	public Pix(double valor){

		this.valor = valor;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Processando Pagamento via PIX...");
		System.out.println("Pagamento de R$" + valor + " enviado instantaneamente!");
		emitirComprovante();
	}
	
	@Override
	public void emitirComprovante() {
		System.out.println("Comprovante digital gerado!");
	}
	
 	@Override
	public void autenticar() {
		
	}



}
