package cafeteira;

import java.util.Scanner;


public class menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		

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
		System.out.println("      7 -                                          ");
		System.out.println("      8 -                                          ");
		System.out.println("      9 -                                          ");
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
			
			
			  break;
    	
		case 2:	
			System.out.println("Atualizar Produto \n\n");
			
		
			break;
	    	
		case 3:
			System.out.println("Listar Todos os Produtos \n\n");
			
			
			break;
	    	
		case 4:	
			System.out.println("Listar Pelo Codigo \n\n");
			
			
			break;
	    	
		case 5:	
			System.out.println("Apagar Produto \n\n");
		
			
			break;
	    	
		case 6:	
			System.out.println("Sair \n\n");
			
			
			
	
		
			
			
			
			
			
		
		
		}
		
		
		
		
		
		
		
	}

}
