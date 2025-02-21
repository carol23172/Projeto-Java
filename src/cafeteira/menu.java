package cafeteira;

import java.util.Scanner;

import controller.ProdutoController;


public class menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController(); //
		
		Scanner leia = new Scanner(System.in);
		
		
		
		
		String nomedoProduto;
		
		while (true) {

		System.out.println("***************************************************");
		System.out.println("                                                   ");
		System.out.println("                  Coffee Cat                       ");
		System.out.println("                                                   ");
	    System.out.println("***************************************************");                                         
		System.out.println("                                                   ");
		System.out.println("      1 - Cadastrar Produto                        ");
		System.out.println("      2 - Atualizar Produto                        ");
		System.out.println("      3 - Listar Todos os Produtos                 ");
		System.out.println("      4 - Listar pelo codigo                       ");
		System.out.println("      5 - Apagar produto                           ");
		System.out.println("      6 - Sair                                     ");
		System.out.println("                                                   ");
		System.out.println("                                                   ");
		System.out.println("                                                   ");
		System.out.println("                                                   ");
		System.out.println("***************************************************");
		System.out.println("Entre com a opção desejada:                        ");
		
		 int opcao =0 ;
		
		 if (opcao == 6)  {
			 
			 System.out.println( "\nCafeteria Coffee Cat - Cafe e Gato, Combinacao Melhor nao Existe!");
		 }
		 
		 leia.nextInt();
		switch(opcao) {
		
		case 1 :
			System.out.println("Cadastrar Produto \n\n");
			System.out.println("Digite o nome do Produto");
			nomedoProduto = leia.nextLine();
    		/**
    		 * System.out.println("Digite o Nome do Titular");
            		leia.skip("\\R?");
            		titular = leia.nextLine();
    		 */
			// nomedoProduto = leia.nextInt();
			System.out.println("Digite o valor do Produto");
			
			
			  break;
    	
		case 2:	
			System.out.println("Atualizar Produto \n\n");
			System.out.println("Digite o novo Produto");
		    produtos.listarTodas();
			
		    break;
	    	
		case 3:
			System.out.println("Listar Todos os Produtos \n\n");
			System.out.println("");
			
			break;
	    	
		case 4:	
			System.out.println("Listar Pelo Codigo \n\n");
			System.out.println("Digite o Codigo do Produto");
			
			
			
			break;
	    	
		case 5:	
			System.out.println("Apagar Produto \n\n");
			System.out.println("Digite o nome do produto");
			int codigoApagar = leia.nextInt();
			
			break;
	    	
		case 6:	
			System.out.println("Sair \n\n");
			
			
			
		default:
    		System.out.println("\nOpcao Invalida!\n");
    		
    		
    		break;
    		
			
			
			
		}
			
	
		
		
			
			
			
		
		
		}
		
		
		
		
		
		
		
	}

}
