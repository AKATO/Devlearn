package br.com.akato.comissaovenda;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;



public class FuncionarioTest extends Builder{
	

	@Test
	public void verificaSeFuncionarioPossuiVenda(){
		Funcionario func = criaFuncionario("corretor");
		Assert.assertEquals(func.getVendas().isEmpty(), true);
	}
	
	@Test
	public void verificaSeVendaDoFuncionarioPossuiValor(){
		Funcionario func = criaFuncionario("corretor");
		adicionaVenda(func, 90000.00, "21/12/2014");
		Assert.assertEquals(func.getVendas().get(0).getValorVenda(),90000.0);
		
	}
	
}
