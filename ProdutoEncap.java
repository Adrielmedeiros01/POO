package meuprojeto;
import java.util.Scanner;
public class ProgramaEncap {
	
	
//	
//	Reescreva o código utilizando uma classe com os atributos: nome, preco e quantidade, e uma ação para calcular o total 
//	a pagar. No main, crie um objeto da classe, leia os valores e mostre o resultado utilizando o método.
//
//	import java.util.Scanner;
//	public class Programa {
//	   public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("Digite o nome do produto: ");
//	      String nome = sc.nextLine();
//	      System.out.print("Digite o preço do produto: ");
//	      double preco = sc.nextDouble();
//	      System.out.print("Digite a quantidade: ");
//	      int quantidade = sc.nextInt();
//	      double total = preco * quantidade;
//	      System.out.println("Produto: " + nome);
//	      System.out.println("Total a pagar: R$ " + total);
//	   }
//	}
//	
	
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public ProgramaEncap(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	
	
	public void totalPagar() {
		
		System.out.println("Valor total a ser pago pela compra: R$"+ (this.preco*this.quantidade));
		
		
	}
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	     System.out.print("Digite o nome do produto: ");
	     String nome = sc.nextLine();
	     System.out.print("Digite o preço do produto: ");
	     double preco = sc.nextDouble();
	     System.out.print("Digite a quantidade: ");
	     int quantidade = sc.nextInt();
	     
	     
	     ProgramaEncap p1 = new ProgramaEncap(nome, preco, quantidade);
	     p1.totalPagar();
		
	}
	
	
	
	
	
	
	
	
	

}
