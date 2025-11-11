package Simulado;

public class Vendedor extends Funcionario{
	
	
	protected int comissao;
	
	public Vendedor(String nome) {
		super(nome);
		this.nome = nome;
		this.comissao = 10;
	}
	
	public void calcularSalario() {
		
		double salario = this.salarioBase + ((this.salarioBase * 10) / 100);
		System.out.println("Salário Vendedor: R$" + salario);
	}
	
	public void exibirDados() {
		System.out.println("Nome do Vendedor: "+ this.nome);
		calcularSalario();
	}
}
