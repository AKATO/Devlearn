package br.com.akato.comissaovenda;

public enum EnumPerfil {
	CORRETORA(0.05,0.04),
	GERENTE(0.03,0.03),
	CORRETOR(0.02,0.03);
	
	EnumPerfil(double valor2014,double valor2015){
		this.porcentagemComissao2014 = valor2014;
		this.porcentagemComissao2015 = valor2015;
	}
	
	double porcentagemComissao2014;
	double porcentagemComissao2015;
	
	double comissao(boolean pertenceA2014){
		if(pertenceA2014) return porcentagemComissao2014;
		else return porcentagemComissao2015;
	}
}
