package br.com.s2it;

public class Main {

	
	public static void main(String args[]){
		
		BinaryTree b1 = new BinaryTree();
		b1.setValor(15);
		
		
		BinaryTree b2 = new BinaryTree();
		b2.setValor(9);
		
		
		BinaryTree b3 = new BinaryTree();
		b3.setValor(5);
		
		BinaryTree b4 = new BinaryTree();
		b4.setValor(2);
		
		BinaryTree b5 = new BinaryTree();
		b5.setValor(7);
		
		BinaryTree b6 = new BinaryTree();
		b6.setValor(11);
		
		BinaryTree b7 = new BinaryTree();
		b7.setValor(20);
		
		
		
		BinaryTree b9 = new BinaryTree();
		b9.setValor(30);
		
		BinaryTree b10 = new BinaryTree();
		b10.setValor(18);
		
		BinaryTree b11 = new BinaryTree();
		b11.setValor(23);
		
		BinaryTree b12 = new BinaryTree();
		b12.setValor(27);
		
		b1.setLeft(b2);
		b1.setRight(b7);
		
		b2.setLeft(b3);
		b2.setRight(b6);
		
		b7.setLeft(b10);
		b7.setRight(b12);
		
		b3.setLeft(b4);
		b3.setRight(b5);
		
		b12.setLeft(b11);
		b12.setRight(b9);
		int somaTodosNosSubsquentesB1 = b1.soma();
		int somaTodosNosSubsquentesB12 = b12.soma();
	    int somaTodosNosSubsquentesB10 = b10.soma();
		System.out.println(somaTodosNosSubsquentesB1);
		System.out.println(somaTodosNosSubsquentesB12);
		System.out.println(somaTodosNosSubsquentesB10);
	}
	
	
	
}
