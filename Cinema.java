package cinema.teste;

import java.util.Scanner;

import cinema.dominio.Filme;
import cinema.dominio.Ingresso;
import cinema.dominio.MenuController;

public class Cinema {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		MenuController.menuFilme();
		System.out.println();
		MenuController.menuSessao();
		System.out.println();
		MenuController.menuIngresso();
		System.out.println();
		MenuController.relatorio();

			
		
			



	}

}
