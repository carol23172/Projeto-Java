package controller;

import java.util.ArrayList;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{

	private ArrayList<Produto>   produtos = new ArrayList<Produto>();
	
	private int contador = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for (var produto : produtos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		produtos.add(produto);
		System.out.println("\nO Produto: " + produto + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
		
		public int gerarProduto() {
		return ++contador;
		
		 
		
	}

}







