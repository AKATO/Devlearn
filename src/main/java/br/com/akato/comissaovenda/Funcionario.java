package br.com.akato.comissaovenda;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;


public class Funcionario extends Comissionado{
	
	private Perfil perfil;
	
	public Funcionario(Perfil perfil) {
		this.perfil = perfil;
		this.comissoes = new HashMap<Date,BigDecimal>();
		this.carregarComissoes(this.perfil);
	}

	public Perfil getPerfil() {
		return perfil;
	}
		
}