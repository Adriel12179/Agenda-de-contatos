package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		String celular = "";
		String email = ""; 
		
		System.out.println("=========================");
		System.out.println("  AGENDA DE CONTATOS");
		System.out.println("       v0.0.0	");
		System.out.println("=========================");
		
		System.out.println("Bem-vindo!");
		
		System.out.println("");
		System.out.println("1 - Adicionar contato");
		System.out.println("2 - Listar contato");
		System.out.println("3 - Procurar contato");
		System.out.println("4 - Excluir contato");
		System.out.println("5 - Sair");
		System.out.println("");
		
		System.out.println("Escolha uma opção:");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
			case 1 -> {
				System.out.println("---Adicionar contato---");
				
				System.out.println("Digite seu nome: ");
				nome = sc.nextLine();
				
				System.out.println("Digite seu número: ");
				celular = sc.nextLine();
				
				System.out.println("Digite seu email: ");
				email = sc.nextLine();
				
				System.out.println("Contato salvo com sucesso!!!");
			}
			case 2 -> {
				System.out.println("Listar contato");
			}
			case 3 -> {
				System.out.println("Procurar contato");
			}
			case 4 -> {
				System.out.println("Excluir contato");
			}
			case 5 -> {
				System.out.println("Saindo...");
			}
			default -> System.out.println("Opção inválida!!!");
		}
	
	}

}
