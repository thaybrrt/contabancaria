package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
    public static void main(String[] args) {
    	Scanner leia = new Scanner(System.in);
    	int opcao;
    	
		// Teste Conta Corrente 
		ContaCorrente cc1 = new ContaCorrente(2, 182, 1, "Andreza", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		// Teste Conta Poupanca 
		ContaPoupanca cp1 = new ContaPoupanca(3, 182, 2, "Meg", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
				
		while(true) {

			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND
					+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("                                                     ");
			System.out.println("             $$  BANCO THAYBANK  $$                  ");
			System.out.println("                                                     ");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("                                                     ");
			System.out.println("Digite uma opção:                                    ");
			System.out.println("                                                     ");
          opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBANCO THAYBANK - A parceria que faz a diferença!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Criar Conta");
				
                 break;
			case 2:
				System.out.println("\n Listar todas as Contas");
				
                 break;
			case 3:
				System.out.println("\n Buscar Conta por número");
				
				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta");
				
                 break;
			case 5:
				System.out.println("\n Apagar Conta");
				
                 break;
			case 6:
				System.out.println("\n Sacar");
				
				break;
             case 7:
				System.out.println("\n Depositar");
				
				break;
             case 8:
				System.out.println("\n Transferir");
				
				break;
			default:
				System.out.println("\nOpção Inválida");
                 break;
			}
        }
	}
   public static void sobre() {
	System.out.println("\n_______________________________________________________");
	System.out.println("Projeto Desenvolvido por:                              ");
	System.out.println("Thayná Vieira Barreto - thaybarreto@live.com           ");
	System.out.println("github.com/thaybrrt                                    ");
	System.out.println("_______________________________________________________");
   }

}