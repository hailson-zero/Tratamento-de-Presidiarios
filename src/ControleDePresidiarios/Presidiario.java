package ControleDePresidiarios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Presidiario {
	private int codigo;
	private String nome;
	private int idade;
	private	String sexo;
	private	String cpf;
	private	Data pena;
	private	ArrayList <FichaCriminal> fichasCriminais;
	
	public Presidiario() {
		fichasCriminais = new ArrayList<>();
	}
	
	public void inserirFicha (FichaCriminal f) {
		fichasCriminais.add(f);
	}
	
	public void removerFicha (int pos) {
		if (fichasCriminais.size() > pos) {
			fichasCriminais.remove(pos);
		}else{
			JOptionPane.showMessageDialog(null, "Ficha não encontrada\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void alteraFicha (int pos, FichaCriminal f) {
		if (fichasCriminais.size() > pos) {
			fichasCriminais.set(pos, f);
		}else{
			JOptionPane.showMessageDialog(null, "Ficha não encontrada\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void pesquisaFicha (int pos) {
		if (fichasCriminais.size() > pos) {
			String aux = fichasCriminais.get(pos).ImprimeFicha();
			JOptionPane.showMessageDialog(null, aux);
		}else{
			JOptionPane.showMessageDialog(null, "Ficha não encontrada\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Data getPena() {
		return pena;
	}

	public void setPena(Data pena) {
		this.pena = pena;
	}

	public ArrayList<FichaCriminal> getFichasCriminais() {
		return fichasCriminais;
	}

	public void setFichasCriminais(ArrayList<FichaCriminal> fichasCriminais) {
		this.fichasCriminais = fichasCriminais;
	}
	
	public String imprimePresidiario () {
		String aux = "\n Código: " + getCodigo()
					+ "\n Nome: " + getNome()
					+ "\n Idade: " + getIdade()
					+ "\n Sexo: "+ getSexo()
					+ "\n CPF: " + getCpf()
					+ "\n Pena_    Inicio:" + pena.getDataEntrada()
					+ "      Saída: "+ pena.getDataSaida()
					+ "\n         FICHA CRIMINAL: 	     ";
		for (FichaCriminal f: fichasCriminais) {
			if(f!=null) { 
				aux += f.ImprimeFicha();
			}
		}
		aux += "\n\n";
		return aux;
	}
}
