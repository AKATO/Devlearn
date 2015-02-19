package br.com.akato.comissaovenda;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeComissaoTest extends Builder{
	
	@Before
	public void criaCalculadora(){
		inicializarFuncionarios();
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		BigDecimal comissao = calculadora.calcularComissaoPorVenda(venda,corretor );
		Assert.assertEquals("A venda do Corretor nao foi comissionada corretamente", 90000.00*0.02, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2014ComMenosDe60Dias(){
		criaVendaComValorEm2014ComMenosDe60Dias();
		BigDecimal comissao = calculadora.calcularComissaoPorVenda(venda,corretor);
		Assert.assertEquals("A venda do Corretor nao deveria ser commissionada", 0.0, comissao.doubleValue());
		
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,corretor);
		Assert.assertEquals("A venda do Corretor nao foi comissionada corretamente", 90000.0*0.03, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,corretor);
		Assert.assertEquals("A venda do Corretor nao deveria ser commissionada", 0.0, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		BigDecimal comissao = calculadora.calcularComissaoPorVenda(venda,corretora);
		Assert.assertEquals("A venda da Corretora nao foi comissionada corretamente", 90000.0*0.05, comissao.doubleValue());

	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2014ComMenosDe60Dias(){
		criaVendaComValorEm2014ComMenosDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,corretora);
		Assert.assertEquals("A venda da corretora nao deveria ser commissionada", 0.0, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,corretora);
		Assert.assertEquals("A venda da Corretora nao foi comissionada corretamente", 90000.0*0.04, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,corretora);
		Assert.assertEquals("A venda da corretora nao deveria ser commissionada", 0.0, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,gerente);
		Assert.assertEquals("A venda do Gerente nao foi commissionada corretamente", 90000.0*0.03, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2014ComMenosDe60Dias(){
		criaVendaComValorEm2014ComMenosDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,gerente);
		Assert.assertEquals("A venda do Gerente nao deveria ser commissionada", 0.0, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,gerente);
		Assert.assertEquals("A venda do Gerente nao foi commissionada corretamente", 90000.0*0.03, comissao.doubleValue());
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		BigDecimal comissao  = calculadora.calcularComissaoPorVenda(venda,gerente);
		Assert.assertEquals("A venda do Gerente nao deveria ser commissionada", 0.0, comissao.doubleValue());
	}
	
}
