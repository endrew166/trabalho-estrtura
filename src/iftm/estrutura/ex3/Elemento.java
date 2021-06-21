package iftm.estrutura.ex3;

public class Elemento <T>{
	 Elemento noEsquerdo;
	    int valor;
	    Elemento noDireito;

	   
	    public Elemento(int valor) {
	        this.valor = valor;
	        noEsquerdo = null;
	        noDireito = null;
	    }

	  
	
	    public void insereElemento(int valorIsercao) {
	        
	        if (valorIsercao < this.valor) {
	         
	            if (this.noEsquerdo == null) {
	                this.noEsquerdo = new Elemento(valorIsercao);
	            } else {
	                this.noEsquerdo.insereElemento(valorIsercao);
	            }
	            
	        } else if (valorIsercao > this.valor) {
	       
	            if(this.noDireito == null){
	                this.noDireito = new Elemento(valorIsercao);
	            }else{
	                this.noDireito.insereElemento(valorIsercao);
	            }
	        }
	    }
	}



