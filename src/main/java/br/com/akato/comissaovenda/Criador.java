package br.com.akato.comissaovenda;

import static br.com.akato.comissaovenda.Perfil.CORRETOR;

public class Criador {
	public static void main(String[]args){
		Funcionario corretor = new Funcionario(CORRETOR);
		
//		corretor.getAno(new Date());
//		corretor.carregarComissoes(new Date(),new BigDecimal("0.03"));
	}
}
