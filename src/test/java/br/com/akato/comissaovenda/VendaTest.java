package br.com.akato.comissaovenda;

import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class VendaTest extends Builder{
	
	
	@Test
	public void verificaSeVendaDoFuncionarioFoiFeitaEm2014(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		Assert.assertEquals("A Venda nao foi feita em 2014", getAnoVenda(venda) , 2014);

	}
	
	@Test
	public void verificaSeVendaDoFuncionarioFoiFeitaEm2015(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		Assert.assertEquals("A Venda nao foi feita em 2015", getAnoVenda(venda) , 2015);
	}
	
	
}
