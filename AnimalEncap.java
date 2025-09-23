package meuprojeto;

import java.util.Scanner;

public class AnimalEncapsulamento {
	
//	Melhore o código criando uma classe com suas características (nome, espécie e idade),
//	além de um método para exibir os dados do animal. No main, crie um objeto da classe, preencha os dados e exiba-os.
//
//
//	import java.util.Scanner;
//
//	public class Programa {
//
//	   public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("Digite o nome do animal: ");
//	      String nome = sc.nextLine();
//	      System.out.print("Digite a espécie do animal: ");
//	      String especie = sc.nextLine();
//	      System.out.print("Digite a idade do animal: ");
//	      int idade = sc.nextInt();
//	      System.out.println("\nDados do animal:");
//	      System.out.println("Nome: " + nome);
//	      System.out.println("Espécie: " + especie);
//	      System.out.println("Idade: " + idade + " anos");
//	   }
//	}
	
	
	public String nome;
	public String especie;
	public int idade;
	
	
	public AnimalEncapsulamento(String nome, String especie, int idade) {	
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
	public void exibirDados() {
		System.out.println("O nome do animal é: "+this.nome);
		System.out.println("A espécie do animal é: "+this.especie);
		System.out.println("A idade do animal é: "+this.idade);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o nome do animal: ");
	    String nome = sc.nextLine();
	    System.out.print("Digite a espécie do animal: ");
	    String especie = sc.nextLine();
	    System.out.print("Digite a idade do animal: ");
	    int idade = sc.nextInt();
		AnimalEncapsulamento a1 = new AnimalEncapsulamento(nome, especie,idade);
		a1.exibirDados();
	}

}
