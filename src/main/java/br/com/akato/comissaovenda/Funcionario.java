package br.com.akato.comissaovenda;

import static br.com.akato.comissaovenda.EnumPerfil.CORRETOR;
import static br.com.akato.comissaovenda.EnumPerfil.CORRETORA;
import static br.com.akato.comissaovenda.EnumPerfil.GERENTE;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private List<Venda> vendas;
	private EnumPerfil perfil;

	
	public Funcionario(String perfil){
		 this.perfil = identificaPerfil(perfil);
		 this.vendas = new ArrayList<Venda>();
		 }
	
	public Funcionario() {
		this.vendas = new ArrayList<Venda>();
	}

	public EnumPerfil getPerfil() {
		return perfil;
	}

	public void setPerfil(EnumPerfil perfil) {
		this.perfil = perfil;
	}

//	 public Funcionario(Double valor,String dataVenda,String perfil){
//	 this.perfil = identificaPerfil(perfil);
//	 this.venda = new Venda(valor,dataVenda);
//	 }
	
	

	private EnumPerfil identificaPerfil(String perfil) {
		if (perfil.equalsIgnoreCase("gerente")) {
			return GERENTE;
		} else if (perfil.equalsIgnoreCase("corretora")) {
			return CORRETORA;
		} else {
			return CORRETOR;
		}
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	
	public void addVenda(Venda venda){
		this.vendas.add(venda);
	}
	
}
