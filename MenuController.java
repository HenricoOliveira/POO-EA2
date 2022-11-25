package cinema.dominio;

import java.util.Scanner;
public class MenuController {
	static String filmeEscolhido2;
	static String sessaoEscolhida2;
	static int quantidadeInteiro2;
	static int quantidadeMeia2;
	static double valorTotal2;

	
	public static void menuFilme() {
		Filme filme1 = new Filme("Homem-Aranha 2","Sam Raimi","Ação","2h 7m");
		Filme filme2 = new Filme("Scott Pilgrim contra o Mundo","Steven Spielberg","Comédia","1h 52m");
		Filme filme3 = new Filme("Jogos Vorazes","Stanley Kubrick","Aventura","2h 22m");
		
		// Passando a descrição
		filme1.setDescricao("Após mostrar à cidade que é um grande herói, Peter Parker ainda precisa enfrentar os problemas do dia a dia");
		filme2.setDescricao("Scott Pilgrim se apaixona pela garota mais popular, ele só não esperava ter que duelar contra seus ex namorados");
		filme3.setDescricao("Em um mundo distópico, adolescnetes se enfrentam em um combate mortal. Katniss precisará da sorte ao seu favor");
	
		
		String[] filmes = {"Homem-Aranha 2","Scott Pilgrim contra o Mundo","Jogos Vorazes"};
		System.out.println("Selecione o filme: ");
		System.out.println("\n----Filmes----");
		System.out.println("1 - "+filme1.getNome()+"\nDiretor: "+filme1.getDiretor()+"\nDescrição: "+filme1.getDescricao()+"\nGênero: "+filme1.getGenero()+"\nDuração: "+filme1.getDuracao());
		System.out.println("\n2 - "+filme2.getNome()+"\nDiretor: "+filme2.getDiretor()+"\nDescrição: "+filme2.getDescricao()+"\nGênero: "+filme2.getGenero()+"\nDuração: "+filme2.getDuracao());
		System.out.println("\n3 - "+filme3.getNome()+"\nDiretor: "+filme3.getDiretor()+"\nDescrição: "+filme3.getDescricao()+"\nGênero: "+filme3.getGenero()+"\nDuração: "+filme3.getDuracao());
		
		Scanner entrada = new Scanner(System.in);
		int filmeEntrada = entrada.nextInt();
		String filmeEscolhido = filmes[filmeEntrada -1];
		System.out.println("Filme: "+filmeEscolhido);
		filmeEscolhido2 = filmeEscolhido;
	
	}
	public static void menuSessao() {
		String[] horarios = {"16h","18h","20h"};
		System.out.println("Selecione a sessão");
		System.out.println("\n----Sessões----");
		System.out.println("1 - 16h");
		System.out.println("2 - 18h");
		System.out.println("3 - 20h");
		
		Scanner entrada = new Scanner(System.in);
		int sessaoEntrada = entrada.nextInt();
		String sessaoEscolhida = horarios[sessaoEntrada -1];
		System.out.println("Sessão: "+sessaoEscolhida);
		sessaoEscolhida2 = sessaoEscolhida;
	}
	public static void menuIngresso() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos ingressos inteiros (R$24): ");
		int quantidadeInteiro = entrada.nextInt();
		System.out.println("Digite quantos ingressos meia-entrada (R$12): ");
		int quantidadeMeia = entrada.nextInt();
		
		double valorInteiro = 24;
		double valorMeia = 12;
		double valorTotal = valorInteiro * quantidadeInteiro + valorMeia * quantidadeMeia;
		System.out.println("Valor total: R$"+valorTotal);
		quantidadeInteiro2 = quantidadeInteiro;
		quantidadeMeia2 = quantidadeMeia;
		valorTotal2 = valorTotal;
	}
	public static void relatorio() {
		System.out.println("----Relatório----");
		System.out.println("Filme: "+ filmeEscolhido2);
		System.out.println("Sessão: "+ sessaoEscolhida2);
		System.out.println("Ingressos: \nInteira: "+quantidadeInteiro2+"\nMeia: "+quantidadeMeia2);
		System.out.println("Valor total: R$"+valorTotal2);
		System.out.println("\nTenha um bom filme!");
	}

}
