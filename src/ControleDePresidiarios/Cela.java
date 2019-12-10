package ControleDePresidiarios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cela {
	private int codigoCela;
	private int capacidade;
	private int qtdePrisioneiros;
	private ArrayList <Presidiario> presidiarios;
	
	public Cela() {
		presidiarios = new ArrayList<>();
		qtdePrisioneiros = 0;
	}
	
	public int getCodigoCela() {
		return codigoCela;
	}

	public void setCodigoCela(int codigoCela) {
		this.codigoCela = codigoCela;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQtdePrisioneiros() {
		return qtdePrisioneiros;
	}

	public void setQtdePrisioneiros(int qtdePrisioneiros) {
		this.qtdePrisioneiros = qtdePrisioneiros;
	}

	public ArrayList<Presidiario> getPresidiarios() {
		return presidiarios;
	}

	public void setPresidiarios(ArrayList<Presidiario> presidiarios) {
		this.presidiarios = presidiarios;
	}
	
	public int verificaQtdePrisioneiros() {
		if (capacidade > qtdePrisioneiros) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public void inserirPresidiario (Presidiario p) {
		int aux = verificaQtdePrisioneiros ();
		if (aux == 1) {
			qtdePrisioneiros++;
			presidiarios.add(p);
		}else {
			JOptionPane.showMessageDialog(null, "A cela esta lotada\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		} 
			
	}
	
	public void removerPresidiario (int pos) {
		if (qtdePrisioneiros > (pos)) {
			presidiarios.remove(pos);
			qtdePrisioneiros--;
		}else{
			JOptionPane.showMessageDialog(null, "Presidiario não encontrado\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void alteraPresidiario (int pos, Presidiario p) {
		if (qtdePrisioneiros > (pos))  {
			presidiarios.set(pos, p);
		}else{
			JOptionPane.showMessageDialog(null, "Presidiario não encontrado\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void pesquisaPresidiario (int pos) {
		if (qtdePrisioneiros > (pos)) {
			String aux = presidiarios.get(pos).imprimePresidiario();
			JOptionPane.showMessageDialog(null, aux);
		}else{
			JOptionPane.showMessageDialog(null, "Presidiario não encontrado\n","ERRO!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String imprimeCela () {
		String aux = "\n Código Cela: " + getCodigoCela()
				+ "\n Capacidade: " + getCapacidade()
				+ "\n Presidiarios: " + getQtdePrisioneiros();
				
		for (Presidiario p: presidiarios) {
			if(p!=null) { 
				
				aux += "\n        PRISIONEIRO: 	   " + p.imprimePresidiario();
			}
		}
		aux += "\n\n";
		return aux;
	}
	
	public String imprimeCela2 () {
		String aux = "\n Código Cela: " + getCodigoCela()
				+ " \n Capacidade: " + getCapacidade()
				+ " \n Presidiarios: " + getQtdePrisioneiros();
		aux += "\n";
		return aux;
	}
	
}
