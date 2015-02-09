package br.com.akato.comissaovenda;

import static br.com.akato.comissaovenda.Perfil.CORRETOR;
import static br.com.akato.comissaovenda.Perfil.CORRETORA;
import static br.com.akato.comissaovenda.Perfil.GERENTE;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
	private Map<Venda,Double> comissoes;
	private Perfil perfil;

	
	public Funcionario(String perfil){
		 this.perfil = identificaPerfil(perfil);
		 this.comissoes = new HashMap<Venda, Double>();
		 }

	public Funcionario(){
		
		
	};
	public Perfil getPerfil() {
		return perfil;
	}
	
	public void adicionaCommisao(Venda venda, Double comissao){
		this.comissoes.put(venda, comissao);
	}
	
	public Double getComissaoPorVenda(Venda venda){
		return this.comissoes.get(venda);
	}
	
	private Perfil identificaPerfil(String perfil) {
		if (perfil.equalsIgnoreCase("gerente")) {
			return GERENTE;
		} else if (perfil.equalsIgnoreCase("corretora")) {
			return CORRETORA;
		} else {
			return CORRETOR;
		}
	}
}
