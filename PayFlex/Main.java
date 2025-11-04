package Principal;

public class Main {
	
	public static void main (String[] args) {
		
		
		CartaoCred c1 = new CartaoCred(500);
		c1.processarPagamento();
		
		System.out.println("");
		
		Pix p1 = new Pix(200);
		p1.processarPagamento();
		
		System.out.println("");
		
		Boleto b1 = new Boleto(100);
		b1.processarPagamento();
		
	}
	
}
