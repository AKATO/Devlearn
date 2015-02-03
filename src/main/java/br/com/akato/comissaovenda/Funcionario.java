package br.com.akato.comissaovenda;

import static br.com.akato.comissaovenda.EnumPerfil.CORRETOR;
import static br.com.akato.comissaovenda.EnumPerfil.CORRETORA;
import static br.com.akato.comissaovenda.EnumPerfil.GERENTE;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
	private Map<Venda,Double> comissoes;
	private EnumPerfil perfil;

	
	public Funcionario(String perfil){
		 this.perfil = identificaPerfil(perfil);
		 this.comissoes = new HashMap<Venda, Double>();
		 }

	public Funcionario(){
		
	};
	public EnumPerfil getPerfil() {
		return perfil;
	}
	
	public void adicionaCommisao(Venda venda, Double comissao){
		this.comissoes.put(venda, comissao);
	}
	
	public Double getComissaoPorVenda(Venda venda){
		return this.comissoes.get(venda);
	}
	
	private EnumPerfil identificaPerfil(String perfil) {
		if (perfil.equalsIgnoreCase("gerente")) {
			return GERENTE;
		} else if (perfil.equalsIgnoreCase("corretora")) {
			return CORRETORA;
		} else {
			return CORRETOR;
		}
	}
}
