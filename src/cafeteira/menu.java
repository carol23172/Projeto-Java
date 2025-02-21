package cafeteira;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ProdutoController;
import model.Cafe;
import model.Cha;


public class menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController(); //
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, tipo;
		float preco;
		
		String nome;
		
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
		
		try {
            opcao = leia.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\nDigite somente números inteiros!");
            leia.nextLine();
            opcao = 0;
        }
		
		 if (opcao == 6)  {
			 
			 System.out.println( "\nCafeteria Coffee Cat - Cafe e Gato, Combinacao Melhor nao Existe!");
		     sobre();
		     leia.close();
		     System.exit(0);
		 }
		 
		 
		
		 switch(opcao) {
		
		case 1:
			System.out.println("Cadastrar Produto \n\n");
			System.out.println("Digite o nome do Produto");
			
			leia.skip("\\R?");
			nome = leia.nextLine();
    		
			
			System.out.println("Digite o valor do Produto");
			leia.skip("\\R?");
			preco= leia.nextFloat();
			
			do {
				System.out.println(" Digite o tipo de produto( 1- Cafe ou 2-Cha ");
				tipo = leia.nextInt();
			}while(tipo < 1 && tipo > 2);
			
		
			switch(tipo){
			case 1 -> {
				produtos.cadastrar(new Cafe(produtos.gerarProduto(), nome, preco, tipo));
			
			}
			
			case 2 -> {
				produtos.cadastrar(new Cha(produtos.gerarProduto(), nome, preco, tipo));
			 
			}
			}
			   keyPress();
				break;
			
		case 2:	
			System.out.println("Atualizar Produto \n\n");
			System.out.println("Digite o novo Produto");
		    
			produtos.listarTodas();
			
			keyPress();
		    break;
	    	
		case 3:
			System.out.println("Listar Todos os Produtos \n\n");
			System.out.println("");
			
			keyPress();
			break;
	    	
		case 4:	
			System.out.println("Listar Pelo Codigo \n\n");
			System.out.println("Digite o Codigo do Produto");
			
			
			keyPress();
			break;
	    	
		case 5:	
			System.out.println("Apagar Produto \n\n");
			System.out.println("Digite o nome do produto");
			int codigoApagar = leia.nextInt();
			
			keyPress();
			break;
	    	
		case 6:	
			System.out.println("Sair \n\n");
			
			
			
		default:
    		System.out.println("\nOpcao Invalida!\n");
    		
    		keyPress();
    		break;
    		
			
			
			}
		}
	}
					
	

	 public static void sobre() {
         System.out.println("\n*************************************************");
         System.out.println(" Projeto Desenvolvido por: ");
			System.out.println("Carolina de Oliveira Almeida - Caroliveira.almeida@gmail.com");                                                 
			System.out.println("https://github.com/carol23172                               ");
			System.out.println("***************************************************");
	 }
	
	 
	 public static void keyPress() {
		 
		 try {
			 System.out.println("\n\nPressione Enter para Continuar");
			 System.in.read();
			 
		 } catch (IOException e) {
					 
			 System.out.println("Voce pressinou uma tecla diferente de entre!");
					 
		   }	 
		 }
	 }
	
	
	
	
	

