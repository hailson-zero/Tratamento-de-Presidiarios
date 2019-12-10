package ControleDePresidiarios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList <Cela> celas = new ArrayList<>();
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU: "
					+ "\n 1 - Registra Cela"
					+ "\n 2 - Controle Prisioneiros "
					+ "\n 3 - Controle FichasCriminais "
					+ "\n 4 - Imprimir Celas"
					+ "\n 0 - Sair:"));
			switch(op) {
				case 1:
				{
					boolean cont = true;
    				while (cont==true) {
    					Cela c = new Cela();
    					c.setCodigoCela(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da Cela: ")));
						c.setCapacidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da Cele: ")));;
						celas.add(c);
						int y = 0;
    					while ((y < 1) || (y > 2)) {
    						y = (Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? [1-Sim/2-Nao]")));
    						if (y==1) {
	    						cont=true;
	    					}else if (y==2) {
	    						cont=false;
	    					}else {
	    						JOptionPane.showMessageDialog(null, "Opção inválida!");
	    					}
    					}
						
    				}//Fim While
    			break;
				}// Fim Case Menu
				
				case 2:
				{
					int op2;
					do {
						op2 = Integer.parseInt(JOptionPane.showInputDialog("CONTROLE DE PRISIONEIRO: "
								+ "\n 1 - Inserir Prisioneiro"
								+ "\n 2 - Remover Prisioneiro"
								+ "\n 3 - Pesquisa Prisioneiro"
								+ "\n 4 - Alterar Prisioneiro"
								+ "\n 5 - Imprimir Prisioneiros"
								+ "\n 0 - Voltar: "));
						switch(op2) {
							case 1:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									boolean cont = true; 
				    				while (cont==true) {
				    					Presidiario p = new Presidiario();
				    					Data d = new Data();
				    					p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Presidiário: ")));
										p.setNome(JOptionPane.showInputDialog("Digite o nome do Presidiário: "));
				    					p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Presidiário: ")));;
				    					p.setSexo(JOptionPane.showInputDialog("Digite o sexo do Presidiário: "));
				    					p.setCpf(JOptionPane.showInputDialog("Digite o cpf do Presidiário: "));
				    					d.setDataEntrada(JOptionPane.showInputDialog("Digite a pena do Presidiário. \nEntrada: "));
				    					d.setDataSaida(JOptionPane.showInputDialog("\nSaída: "));
				    					p.setPena(d);
				    					celas.get(pos).inserirPresidiario(p);
				    					
				    					int y = 0;
				    					while ((y < 1) || (y > 2)) {
				    						y = (Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? [1-Sim/2-Nao]")));
				    						if (y==1) {
					    						cont=true;
					    					}else if (y==2) {
					    						cont=false;
					    					}else {
					    						JOptionPane.showMessageDialog(null, "Opção ínvalida!");
					    					}
				    					}
				    					
				    				}//Fim While
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 1 Presidiario
							
							case 2:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite índice da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite código do prisioneiro: ")));
									celas.get(pos).removerPresidiario(pos2);
									JOptionPane.showMessageDialog(null, "Removido com sucesso!");
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 2 Presidiario
							
							case 3:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite código do prisioneiro: ")));
									celas.get(pos).pesquisaPresidiario(pos2);
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 3 Presidiario
							
							case 4:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da cela: ")));
								if (celas.size() > pos) {
									boolean cont = true; 
				    				while (cont==true) {
				    					Presidiario p = new Presidiario();
				    					Data d = new Data();
				    					JOptionPane.showMessageDialog(null, "Atualize os dados do Presidiário!");
				    					p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Presidiário: ")));
										p.setNome(JOptionPane.showInputDialog("Digite o nome do Presidiário: "));
				    					p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Presidiário: ")));;
				    					p.setSexo(JOptionPane.showInputDialog("Digite o sexo do Presidiário: "));
				    					p.setCpf(JOptionPane.showInputDialog("Digite o cpf do Presidiário: "));
				    					d.setDataEntrada(JOptionPane.showInputDialog("Digite a pena do Presidiário. \nEntrada: "));
				    					d.setDataSaida(JOptionPane.showInputDialog("\nSaida: "));
				    					p.setPena(d);
				    					int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Presidiário que deseja alterar: ")));
				    					celas.get(pos).alteraPresidiario(pos2, p);
				    					int y = 0;
				    					while ((y < 1) || (y > 2)) {
				    						y = (Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? [1-Sim/2-Nao]")));
				    						if (y==1) {
					    						cont=true;
					    					}else if (y==2) {
					    						cont=false;
					    					}else {
					    						JOptionPane.showMessageDialog(null, "Opção ínvalida!");
					    					}
				    					}
				    				}//Fim While
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 4 Presidiario
							
							case 5:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									String aux = celas.get(pos).imprimeCela();
									JOptionPane.showMessageDialog(null, aux);
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 5 Presidiario
						}
					}while(op2 != 0);//Fim do While Opção 2
					break;
				}//Fim Case 2 Menu
					
				case 3:
				{
					int op3;
					do {
						op3 = Integer.parseInt(JOptionPane.showInputDialog("MENU FICHA CRIMINAL: "
								+ "\n 1 - Inserir Ficha"
								+ "\n 2 - Remover Ficha"
								+ "\n 3 - Pesquisa Ficha"
								+ "\n 4 - Altera Ficha"
								+ "\n 5 - Imprimir Ficha"
								+ "\n 0 - Voltar: "));
						switch(op3) {
							case 1:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece do prisioneiro: ")));
									if (celas.get(pos).getPresidiarios().size() > pos2) {
										boolean cont = true; 
					    				while (cont==true) {
					    					int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o nível do crime:"
					    																		+ "\n1 - Leve"
					    																		+ "\n2 - Mediano"
					    																		+ "\n3 - Grave"
					    																		+ "\n4 - Hediondo"));
					    					if (opc == 1)
					    					{
					    						FichaCriminal l = new Leve();
					    						l.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
					    						l.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
						    					celas.get(pos).getPresidiarios().get(pos2).inserirFicha(l);
					    					}else {
					    						if (opc == 2)
						    					{
						    						FichaCriminal m = new Mediano();
						    						m.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
							    					m.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
							    					celas.get(pos).getPresidiarios().get(pos2).inserirFicha(m);
						    					}else {
						    						if (opc == 3)
							    					{
							    						FichaCriminal g = new Grave();
							    						g.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
							    						g.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
								    					celas.get(pos).getPresidiarios().get(pos2).inserirFicha(g);
							    					}else {
							    						if (opc == 4)
								    					{
								    						FichaCriminal h = new Hediondo();
								    						h.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
								    						h.setDescricao(JOptionPane.showInputDialog("Digite o descricao da ficha:"));
									    					celas.get(pos).getPresidiarios().get(pos2).inserirFicha(h);
								    					}
							    					}
						    					}
					    					}
					    					
					    					int y = 0;
					    					while ((y < 1) || (y > 2)) {
					    						y = (Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? [1-Sim/2-Nao]")));
					    						if (y==1) {
						    						cont=true;
						    					}else if (y==2) {
						    						cont=false;
						    					}else {
						    						JOptionPane.showMessageDialog(null, "Opção ínvalida!");
						    					}
					    					}
					    				}//Fim While
									}else {
										JOptionPane.showMessageDialog(null, "Prisioneiro não encontrado!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 1 Ficha
							
							case 2:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece do prisioneiro: ")));
									if (celas.get(pos).getPresidiarios().size() > pos2) {
										int pos3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da Ficha Criminal: ")));
										celas.get(pos).getPresidiarios().get(pos2).removerFicha(pos3);
										JOptionPane.showMessageDialog(null, "Removido com sucesso!");
									}else {
										JOptionPane.showMessageDialog(null, "Prisioneiro não encontrado!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 2 Ficha
							
							case 3:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece do prisioneiro: ")));
									if (celas.get(pos).getPresidiarios().size() > pos2) {
										int pos3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da Ficha Criminal: ")));
										celas.get(pos).getPresidiarios().get(pos2).pesquisaFicha(pos3);	
									}else {
										JOptionPane.showMessageDialog(null, "Prisioneiro não encontrado!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 3 Ficha
							
							case 4:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece do prisioneiro: ")));
									if (celas.get(pos).getPresidiarios().size() > pos2) {
										boolean cont = true; 
					    				while (cont==true) {
					    					int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o nível do crime:"
					    																		+ "\n1 - Leve"
					    																		+ "\n2 - Mediano"
					    																		+ "\n3 - Grave"
					    																		+ "\n4 - Hediondo"));
					    					if (opc == 1)
					    					{
					    						FichaCriminal l = new Leve();
					    						l.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
					    						l.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
						    					int pos3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da Ficha Criminal: ")));
						    					celas.get(pos).getPresidiarios().get(pos2).alteraFicha(pos3, l);
					    					}else {
					    						if (opc == 2)
						    					{
						    						FichaCriminal m = new Mediano();
						    						m.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
						    						m.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
							    					int pos3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da Ficha Criminal: ")));
							    					celas.get(pos).getPresidiarios().get(pos2).alteraFicha(pos3, m);
						    					}else {
						    						if (opc == 3)
							    					{
							    						FichaCriminal g = new Grave();
							    						g.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
							    						g.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
								    					int pos3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da Ficha Criminal: ")));
								    					celas.get(pos).getPresidiarios().get(pos2).alteraFicha(pos3, g);
							    					}else {
							    						if (opc == 4)
								    					{
								    						FichaCriminal h = new Hediondo();
								    						h.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da ficha: ")));
								    						h.setDescricao(JOptionPane.showInputDialog("Digite o descricao do crime:"));
									    					int pos3 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da Ficha Criminal: ")));
									    					celas.get(pos).getPresidiarios().get(pos2).alteraFicha(pos3, h);
								    					}
							    					}
						    					}
					    					}
					    					int y = 0;
					    					while ((y < 1) || (y > 2)) {
					    						y = (Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? [1-Sim/2-Nao]")));
					    						if (y==1) {
						    						cont=true;
						    					}else if (y==2) {
						    						cont=false;
						    					}else {
						    						JOptionPane.showMessageDialog(null, "Opção invalida!");
						    					}
					    					}	
					    					
					    				}//Fim While
									}else {
										JOptionPane.showMessageDialog(null, "Prisioneiro não encontrado!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}

								break;
							}//Fim Case 4 Ficha
							
							case 5:
							{
								int pos = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece da cela: ")));
								if (celas.size() > pos) {
									int pos2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite o índece do prisioneiro: ")));
									if (celas.get(pos).getPresidiarios().size() > pos2) {
										String aux = celas.get(pos).getPresidiarios().get(pos2).imprimePresidiario();
										JOptionPane.showMessageDialog(null, aux);
									}else {
										JOptionPane.showMessageDialog(null, "Prisioneiro não encontrado!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Cela não encontrada!\n","ERRO!",JOptionPane.ERROR_MESSAGE);
								}
								break;
							}//Fim Case 5 Ficha
						}
					}while(op3 != 0); //Fim do While Opção 3
					break;
				}//Fim Case 3 Menu
				
				case 4:
				{
					String aux = "LISTA DE CELAS" ; 
					for (Cela c: celas) {
						if(c!=null) { 
							aux += c.imprimeCela2();
						}
					} 
					JOptionPane.showMessageDialog(null, aux);
					break;
				}//Fim Case 4 Menu
			}
			
		}while(op != 0);// Fim do While Menu
	}
	
}
