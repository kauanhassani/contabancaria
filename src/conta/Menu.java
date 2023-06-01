package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			
			System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "****************************************************");
			System.out.println("                                                    ");
			System.out.println("                                                    ");
			System.out.println("                BANCO DE BRAZIL COM Z               ");
			System.out.println("                                                    ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("          1 - Criar conta                           ");
			System.out.println("          2 - Listar todas as contas                ");
			System.out.println("          3 - Buscar conta por número               ");
			System.out.println("          4 - Atualizar Dados da conta              ");
			System.out.println("          5 - Apagar conta                          ");
			System.out.println("          6 - Sacar                                 ");
			System.out.println("          7 - Depositar                             ");
			System.out.println("          8 - Transferir valores entre contas       ");
			System.out.println("          9 - Sair                                  ");
			System.out.println("****************************************************");
			System.out.println("                                                    " + Cores.TEXT_RESET);
			System.out.print("          Entre com a opção desejada:          ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Banco do Brazil com Z - O seu futuro" + "começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar nova conta\n\n");

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as contas\n\n");
				
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar conta por número\n\n");
				
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar Dados da conta - por um número\n\n");
				
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar conta\n\n");
				
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Sacar\n\n");
				
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
				
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferir valores entre contas\n\n");
				
				break;
				
			case 9:
				System.out.println("Sair\n\n" + Cores.TEXT_RESET);
				
				
				break;
			}

		}

	}

}
