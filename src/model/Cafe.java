package model;

public class Cafe extends Produto {

	
	 private String aroma;

	public Cafe(String codigo, String nome, float preco, int tipo, String aroma) {
		super(codigo, nome, preco, tipo);
		this.aroma = aroma;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	} 
	 
	 
	
}
