package ControleDePresidiarios;

public class Mediano extends FichaCriminal {

	public String ImprimeFicha() {
		String aux =   "\n Codigo: "+ getCodigo()
        			+ "\n Nivel Criminal: Mediano " 
        			+ "\n Descri��o: "+ getDescricao() + "\n";
		return aux;
	}

}