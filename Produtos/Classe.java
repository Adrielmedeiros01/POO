package ProvaPoo;

public class Produto {
	
	private String nome;
	private double preco;
	private String descricao;
	private int estoque;
	
	public Produto(String nome, double preco, String descricao, int estoque) {	
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.estoque = estoque;	
	}
	
	public void exibirInfo() {
		System.out.println("=============================================================");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do porduto: R$" + this.preco);
		System.out.println("Descrição do produto: " + this.descricao);
		System.out.println("Quantidade no estoque: "+ this.estoque + " unidades");
		System.out.println("=============================================================");
	}
	
	public void addEstoque(int quant) {
		this.estoque = this.estoque + quant;
		System.out.println("Foram inseridas "+quant+" unidades");
	}
	public void retiraEstoque(int quant) {
		this.estoque = this.estoque - quant;
		System.out.println("Foram retiradas "+quant+" unidades");
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return this.estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("pipoca", 1.50, "Sabor Pizza", 100);
		p1.exibirInfo();
		p1.addEstoque(10);
		p1.exibirInfo();
		p1.retiraEstoque(50);
		p1.exibirInfo();
	}
	

}
