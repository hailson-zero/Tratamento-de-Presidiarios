package ControleDePresidiarios;

public class Hediondo extends FichaCriminal {

	public String ImprimeFicha() {
		String aux =  "\n Codigo: "+ getCodigo()
        			+ "\n Nivel Criminal: Hediondo " 
        			+ "\n Descri��o: \n"+ getDescricao() + "\n";
		return aux;
	}

}