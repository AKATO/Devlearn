package br.com.akato.comissaovenda;

import java.util.Map;
import java.util.TreeMap;


public enum EnumPerfil {
	CORRETORA(0.05,0.04),
	GERENTE(0.03,0.03),
	CORRETOR(0.02,0.03);
	
	EnumPerfil(double valor2014,double valor2015){
		mapaDeComissao.put(2014, valor2014);
		mapaDeComissao.put(2015, valor2015);
	}
	
	Map<Integer,Double> mapaDeComissao = new TreeMap<Integer,Double>();
	
	double comissaoDoAno(int ano){
		return mapaDeComissao.get(ano);
	}
	
}
