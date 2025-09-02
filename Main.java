import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseDados bd = new BaseDados();

        while (true) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Idade do aluno: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                Validacao v = new Validacao();

                if (!v.validaNome(nome) || !v.validaIdade(idade)) {
                    System.out.println("Dados inválidos.");
                } else {
                    Aluno novoAluno = new Aluno(nome, idade);
                    bd.cadastrar(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                }

            } else if (opcao == 2) {
                if (bd.listaVazia()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    System.out.println("Lista de alunos:");
                    bd.exibirAlunos();
                }

            } else if (opcao == 3) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu(){
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Sair");
    }
}