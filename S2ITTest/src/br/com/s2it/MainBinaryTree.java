package br.com.s2it;

public class MainBinaryTree {

	
	public static void main(String args[]){
		
		MainBinaryTree b1 = new MainBinaryTree();
		b1.setValor(15);
		
		
		MainBinaryTree b2 = new MainBinaryTree();
		b2.setValor(9);
		
		
		MainBinaryTree b3 = new MainBinaryTree();
		b3.setValor(5);
		
		MainBinaryTree b4 = new MainBinaryTree();
		b4.setValor(2);
		
		MainBinaryTree b5 = new MainBinaryTree();
		b5.setValor(7);
		
		MainBinaryTree b6 = new MainBinaryTree();
		b6.setValor(11);
		
		MainBinaryTree b7 = new MainBinaryTree();
		b7.setValor(20);
		
		
		
		MainBinaryTree b9 = new MainBinaryTree();
		b9.setValor(30);
		
		MainBinaryTree b10 = new MainBinaryTree();
		b10.setValor(18);
		
		MainBinaryTree b11 = new MainBinaryTree();
		b11.setValor(23);
		
		MainBinaryTree b12 = new MainBinaryTree();
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
