package ControleDePresidiarios;

public class Grave extends FichaCriminal {

	public String ImprimeFicha() {
		String aux =  "\n Codigo: "+ getCodigo()
        			+ "\n Nivel Criminal: Grave " 
        			+ "\n Descrição: "+ getDescricao() + "\n";
		return aux;
	}

}