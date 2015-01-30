package br.com.akato.comissaovenda;

import junit.framework.Assert;

import org.junit.Test;

public class VendaTest extends Builder{
	
	
	@Test
	public void verificaSeVendaDoFuncionarioFoiFeitaEm2014(){
		Venda venda = criaVendaComValorEm2014(90000.00, "01/01/2014");
		Assert.assertEquals(venda.vendaFoiFeitaEm2014(), true);

	}
	
	@Test
	public void verificaSeVendaDoFuncionarioFoiFeitaEm2015(){
		Venda venda = criaVendaComValorEm2015(90000.00, "01/01/2015");
		Assert.assertEquals(venda.vendaFoiFeitaEm2014(), true);

	}
	

	
}
