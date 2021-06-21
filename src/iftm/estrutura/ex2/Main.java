package iftm.estrutura.ex2;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaComPrioridade<ClienteSupermercado> fila = new FilaComPrioridade<ClienteSupermercado>();
		int idoso =1;
		int gestante = 2;
		int maxItem = 3;
		int resto = 4;
	
		
		
		
		ClienteSupermercado c1 = new ClienteSupermercado("Maria",  resto);
		ClienteSupermercado c2 = new ClienteSupermercado("Talia", gestante);
		ClienteSupermercado c3 = new ClienteSupermercado("Mike",maxItem );
		ClienteSupermercado c4 = new ClienteSupermercado("Micão",idoso);
	
	
		fila.enfileirar(c1);
		fila.enfileirar(c4);
		fila.enfileirar(c3);
		fila.enfileirar(c2);
		
			System.out.println(fila.toString());
	        System.out.println("Chamar: " + fila.desenfileira());
	    
	
	}

}
