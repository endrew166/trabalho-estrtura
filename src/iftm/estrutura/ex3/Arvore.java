package iftm.estrutura.ex3;

public class Arvore {

    private Elemento raiz;

   
    public Arvore(){
        this.raiz = null;
    }
    

    public void insereElemento(int valorIsercao){
        if(this.raiz == null){
        
            this.raiz = new Elemento(valorIsercao);
        }else{
       
            this.raiz.insereElemento(valorIsercao);
        }
    }

    public void preOrdemTransversal(){
        preOrdemAuxiliar(this.raiz);
    }

    private void preOrdemAuxiliar(Elemento no) {
        if(no == null){
            return;
        }
        System.out.printf(" %d ",no.valor);
        preOrdemAuxiliar(no.noEsquerdo);
        preOrdemAuxiliar(no.noDireito);
    }

    public void inOrdemTransversal(){
        inOrdemAuxiliar(this.raiz);
    }

    private void inOrdemAuxiliar(Elemento no) {
        if(no == null){
            return;
        }        
        inOrdemAuxiliar(no.noEsquerdo);
        System.out.printf(" %d ",no.valor);
        inOrdemAuxiliar(no.noDireito);
    }

    public void posOrdemTransversal(){
        posOrdemAuxiliar(this.raiz);
    }

    private void posOrdemAuxiliar(Elemento no) {
        if(no == null){
            return;
        }        
        posOrdemAuxiliar(no.noEsquerdo);      
        posOrdemAuxiliar(no.noDireito);
        System.out.printf(" %d ",no.valor);
    }
}