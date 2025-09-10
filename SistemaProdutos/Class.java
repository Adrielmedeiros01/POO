package ProvaPoo;

import java.util.Scanner;


public class SistemaProdutos {

	static Scanner scanner = new Scanner(System.in);
	static String[] nomes = new String[50];
    static double[] precos = new double[50];
    static int[] quantidades = new int[50];
    static public int total = 0;
    
    public static void cadastrarProd() {
    	System.out.print("Nome do produto: ");
        nomes[total] = scanner.nextLine();
        System.out.print("Preço: ");
        precos[total] = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        quantidades[total] = scanner.nextInt();
        scanner.nextLine();
        total++;
        System.out.println("Produto cadastrado com sucesso!\n");
    }
    
    public static void listarProdValor() {
    	for (int i = 0; i < total; i++) {
            double totalEstoque = precos[i] * quantidades[i];
            System.out.println(nomes[i] + " - Preço: R$" + precos[i] + " - Qtd: " + quantidades[i] + " - Total em estoque: R$" + totalEstoque);
        }
        System.out.println();
    }
    
    public static void exibirMenu() {
    	 while (true) {
    	        System.out.println("1 - Cadastrar produto");
    	        System.out.println("2 - Listar produtos e valores em estoque");
    	        System.out.println("0 - Sair");
    	        System.out.print("Escolha uma opção: ");
    	        int opcao = scanner.nextInt();
    	        scanner.nextLine();
    	        if (opcao == 1) {
    	            cadastrarProd();
    	        } else if (opcao == 2) {
    	            listarProdValor();
    	        } else if (opcao == 0) {
    	            break;

    	        } else {
    	            System.out.println("Opção inválida!\n");
    	        }
    	    }
    	   	scanner.close();
    	}
    
    
    public class Produto {
    	
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double totalEmEstoque() {
            return preco * quantidade;
        }
    }

    public static void main(String[] args) {
    	exibirMenu();
    }
    	

    }
    	
    	


