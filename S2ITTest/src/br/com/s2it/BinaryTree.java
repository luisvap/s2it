package br.com.s2it;

public class BinaryTree {

	private int valor;
	
	private BinaryTree left;
	
	private BinaryTree right;
	
	public int soma(){
		
		int resultado = emOrdem(this);
		resultado = resultado - this.getValor();
		
		return resultado;
		
	}

	private int emOrdem(BinaryTree no){
		int somaEsquerda=0, somaDireita = 0;
		
		if(this != null)
	       {
	           if(no.getLeft()!=null)
			   somaEsquerda = emOrdem(no.getLeft());
	           System.out.print(no.getValor()+" ");
	           if(no.getRight()!=null)
	           somaDireita = emOrdem(no.getRight());
	       }
		
		return somaEsquerda + no.getValor() + somaDireita;
	}
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	
	
}
