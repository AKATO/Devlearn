package br.com.akato.comissaovenda;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;



public class FuncionarioTest extends Builder{
	
	@Before
	public void init(){
		inicializarFuncionarios();
	}
	
	
	@Test
	public void verificaSeCorretorPossuiVendaComissaoCorretaEm2014(){
		BigDecimal comissao = corretor.getComissaoPorData(FormataDataVenda("10/10/2014"));
		Assert.assertEquals("A porcentagem do corretor em 2014 deve ser" + comissao, 
				comissao,0.03);
	
	
	}
	
	
	@Test
	public void verificaSeCorretorPossuiVendaComissaoCorretaEm2015(){
		BigDecimal comissao = corretor.getComissaoPorData(FormataDataVenda("01/01/2015"));
		Assert.assertEquals("A porcentagem do corretor em 2015 deve ser" + comissao, 
				comissao,04);
	}
	

	@Test
	public void verificaSeGerentePossuiVendaComissaoCorretaEm2014(){
		BigDecimal comissao = gerente.getComissaoPorData(FormataDataVenda("10/10/2014"));
		Assert.assertEquals("A porcentagem do Gerente em 2014 deve ser" + comissao, 
				comissao,0.03);
	}
	
	@Test
	public void verificaSeGerentePossuiVendaComissaoCorretaEm2015(){
		BigDecimal comissao = gerente.getComissaoPorData(FormataDataVenda("10/10/2015"));
		Assert.assertEquals("A porcentagem do Gerente em 2015 deve ser" + comissao, 
				comissao,0.03);
	}
	
	@Test
	public void verificaSeCorretoraPossuiVendaComissaoCorretaEm2014(){
		BigDecimal comissao = corretora.getComissaoPorData(FormataDataVenda("10/10/2014"));
		Assert.assertEquals("A porcentagem da Corretora em 2014 deve ser" + comissao, 
				comissao,0.05);
	}
	
	@Test
	public void verificaSeCorretoraPossuiVendaComissaoCorretaEm2015(){
		BigDecimal comissao = corretora.getComissaoPorData(FormataDataVenda("10/10/2015"));
		Assert.assertEquals("A porcentagem da Corretora em 2015 deve ser" + comissao, 
				comissao,0.04);
	}
}