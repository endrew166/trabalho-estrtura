package iftm.estrutura.ex3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Arvore arvore = new Arvore();
	       arvore.insereElemento(8);
	       arvore.insereElemento(4);
	       arvore.insereElemento(6);
	       arvore.insereElemento(5);
	       arvore.insereElemento(2);
	       arvore.insereElemento(3);
	       arvore.insereElemento(1);
	       arvore.insereElemento(12);
	       arvore.insereElemento(10);
	       arvore.insereElemento(11);
	       arvore.insereElemento(14);
	       arvore.insereElemento(13);
	       arvore.insereElemento(15);
	        	
	        System.out.println("\n\nPreOrdem ");
	        arvore.preOrdemTransversal();

	        System.out.println("\n\nInOrdem ");
	        arvore.inOrdemTransversal();

	        System.out.println("\n\nPosOrdem ");
	        arvore.posOrdemTransversal();
	    }
	}
