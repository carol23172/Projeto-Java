package model;

public abstract class Produto {

	
	private String codigo;
	private String nome;       //texto
	private float preco;
	private int tipo;
	
	
	
      public Produto(String codigo, String nome, float preco, int tipo) {
	
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}

     


	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public float getPreco() {
		return preco;
	}




	public void setPreco(float preco) {
		this.preco = preco;
	}




	public int getTipo() {
		return tipo;
	}




	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public void visualizar () {
	   
    	  String tipo = "";
    	  switch(this.tipo) { 
    	  case 1 :
    			  tipo = "Cafe";
    			  break;
    	  case 2 :
    		  tipo = "Cha";
    		  break;
    		  
    	  }
    	  	   
	   
	  System.out.println("**********************");
	  System.out.println("Informacoes do produto:");
	  System.out.println("**********************");
	  System.out.println("valor do produto" + this.preco);
	  System.out.println(" Nome do Produto " + tipo); 
	  System.out.println("codigo do produto" + this.codigo);
	  System.out.println("**********************");
	 
	  
  }

	

	
	
}

	
	
	
	
	