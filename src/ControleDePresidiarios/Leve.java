package ControleDePresidiarios;

public class Leve extends FichaCriminal {

	public String ImprimeFicha() {
		String aux =  "\n Codigo: "+ getCodigo()
			        + "\n Nivel Criminal: Leve " 
					+ "\n Descrição: "+ getDescricao() + "\n";
		return aux;
	}

}
