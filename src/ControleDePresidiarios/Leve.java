package ControleDePresidiarios;

public class Leve extends FichaCriminal {

	public String ImprimeFicha() {
		String aux =  "\n Codigo: "+ getCodigo()
			        + "\n Nivel Criminal: Leve " 
					+ "\n Descri��o: "+ getDescricao() + "\n";
		return aux;
	}

}
