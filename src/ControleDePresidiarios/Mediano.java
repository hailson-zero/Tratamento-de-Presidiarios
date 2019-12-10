package ControleDePresidiarios;

public class Mediano extends FichaCriminal {

	public String ImprimeFicha() {
		String aux =   "\n Codigo: "+ getCodigo()
        			+ "\n Nivel Criminal: Mediano " 
        			+ "\n Descrição: "+ getDescricao() + "\n";
		return aux;
	}

}