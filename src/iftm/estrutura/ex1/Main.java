package iftm.estrutura.ex1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> original = new Stack<>();
		Stack<Integer>  destino = new Stack<>();
		Stack<Integer> aux = new Stack<>();
		
		original.push(1);
		original.push(2);
		original.push(3);
		
		torre(original.size(),original,destino,aux);
	
	}

	public static void torre(int n, Stack<Integer> original, Stack<Integer> destino,Stack<Integer> aux ) {
		
		if(n>0) {
			torre(n-1,original,aux,destino);
			destino.push(original.pop());
			System.out.println("--------");
			System.out.println("Original:"+original);
			System.out.println("Destino:"+destino);
			System.out.println("Aux:"+aux);
			torre(n-1,aux,destino,original);
		}
	
	
	}



}
