package br.com.s2it;

import java.util.Scanner;

public class Main {

	private static int algoritmo(int a, int b){
		long c = 0;
		
		String stringA = String.valueOf(a);
		String stringB = String.valueOf(b);
		
		StringBuffer stringC = new StringBuffer();
		for(int i=0; i<6; i++){
			
			if(i <= stringA.length()-1)
			stringC.append(stringA.charAt(i));
			if(i <= stringB.length()-1)
			stringC.append(stringB.charAt(i));
		}
	
		
		
		c = Long.valueOf(stringC.toString());
		if (c > 1000000){
			System.out.println(c);
			System.out.println("Nao pode ser maior que 1000000");
			return -1;
		}
		
		return (int)c;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite primeiro numero inteiro (a):");
		int a = s.nextInt();
		System.out.println("Digite segundo numero inteiro (b) :");
		int b = s.nextInt();
		
		
		int c = algoritmo(a,b);
		System.out.println("Numero eh: " + c);
		s.close();
		
	}

}
