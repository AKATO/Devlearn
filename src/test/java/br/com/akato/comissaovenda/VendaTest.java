package br.com.akato.comissaovenda;

import junit.framework.Assert;

import org.junit.Test;

public class VendaTest extends Builder{
	
	
	@Test
	public void verificaSeVendaDoFuncionarioFoiFeitaEm2014(){
		Venda venda = criaVendaComValorEm2014(90000.00, "01/01/2014");
		Assert.assertEquals("A Venda nao foi feita em 2014", venda.getAnoDeVenda() == 2014);

	}
	
	@Test
	public void verificaSeVendaDoFuncionarioFoiFeitaEm2015(){
		Venda venda = criaVendaComValorEm2015(90000.00, "01/01/2015");
		Assert.assertEquals("A Venda nao foi feita em 2015", venda.getAnoDeVenda() == 2015);

	}
	

	
}
