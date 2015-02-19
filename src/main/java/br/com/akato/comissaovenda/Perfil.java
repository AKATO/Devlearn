package br.com.akato.comissaovenda;


import java.util.HashMap;
import java.util.Map;

public enum Perfil {
	CORRETORA(), GERENTE(), CORRETOR();
	
	static Map<String,Perfil> mapaDePerfil;
	
	static{
		mapaDePerfil = new HashMap<String,Perfil>();
		mapaDePerfil.put("CORRETORA",CORRETORA);
		mapaDePerfil.put("GERENTE",GERENTE);
		mapaDePerfil.put("CORRETOR",CORRETOR);
	}

}
