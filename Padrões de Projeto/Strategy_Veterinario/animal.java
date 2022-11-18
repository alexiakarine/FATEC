public class Animal{

private Aplicacao aplicacao; 
	
    public void setAplicacao(Aplicacao apicacao){
        this.aplicacao = aplicacao;
    }

    public void aplicarVacina(){
        this.aplicacao.aplicacao();
    }	
		
}