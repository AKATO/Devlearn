package br.com.akato.comissaovenda;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeComissaoTest extends Builder{
	
	@Before
	public void criaCalculadora(){
		inicializaObjetos();
	}
	
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		criaFuncionarioCorretor();
		calculadora.calcularComissaoPorVenda(venda,funcionario );
		Assert.assertEquals("A venda do Corretor nao foi comissionada corretamente", 90000.0*0.02, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2014ComMenosDe60Dias(){
		criaCalculadora();
		criaVendaComValorEm2014ComMenosDe60Dias();
		criaFuncionarioCorretor();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Corretor nao deveria ser commissionada", 0.0, funcionario.getComissaoPorVenda(venda));
		
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		criaFuncionarioCorretor();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Corretor nao foi comissionada corretamente", 90000.0*0.03, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		criaFuncionarioCorretor();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Corretor nao deveria ser commissionada", 0.0, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		criaFuncionarioCorretora();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda da Corretora nao foi comissionada corretamente", 90000.0*0.05, funcionario.getComissaoPorVenda(venda));

	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2014ComMenosDe60Dias(){
		criaVendaComValorEm2014ComMenosDe60Dias();
		criaFuncionarioCorretora();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda da corretora nao deveria ser commissionada", 0.0, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		criaFuncionarioCorretora();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda da Corretora nao foi comissionada corretamente", 90000.0*0.04, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		criaFuncionarioCorretora();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda da corretora nao deveria ser commissionada", 0.0, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		criaFuncionarioGerente();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Gerente nao foi commissionada corretamente", 90000.0*0.03, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2014ComMenosDe60Dias(){
		criaVendaComValorEm2014ComMenosDe60Dias();
		criaFuncionarioGerente();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Gerente nao deveria ser commissionada", 0.0, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		criaFuncionarioGerente();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Gerente nao foi commissionada corretamente", 90000.0*0.03, funcionario.getComissaoPorVenda(venda));
	}
	
	@Test
	public void verificaComissaoDeGerenteComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		criaFuncionarioGerente();
		calculadora.calcularComissaoPorVenda(venda,funcionario);
		Assert.assertEquals("A venda do Gerente nao deveria ser commissionada", 0.0, funcionario.getComissaoPorVenda(venda));
	}
	
}
