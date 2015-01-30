package br.com.akato.comissaovenda;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeComissaoTest extends Builder{
	
	CalculadoraDeComissao calculadora;
	Venda venda;
	Funcionario funcionario;
	
	@Before
	public void criaCalculadora(){
		calculadora = new CalculadoraDeComissao();
		venda = new Venda();
		funcionario = new Funcionario();
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		double valorComissao = calculadora.calcularComissaoPorVenda(venda,criaFuncionarioCorretor());
		Assert.assertEquals(valorComissao, 90000.0*0.02);
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2014ComMenosDe60Dias(){
		criaVendaComValorEm2014ComMenosDe60Dias();
		double valorComissao = calculadora.calcularComissaoPorVenda(venda,criaFuncionarioCorretor());
		Assert.assertEquals(valorComissao, 90000.0*0.02);
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2015ComMaisDe60Dias(){
		criaVendaComValorEm2015ComMaisDe60Dias();
		double valorComissao = calculadora.calcularComissaoPorVenda(venda,criaFuncionarioCorretor());
		Assert.assertEquals(valorComissao, 90000.0*0.02);
	}
	
	@Test
	public void verificaComissaoDeCorretorComVendaDe2015ComMenosDe60Dias(){
		criaVendaComValorEm2015ComMenosDe60Dias();
		double valorComissao = calculadora.calcularComissaoPorVenda(venda,criaFuncionarioCorretor());
		Assert.assertEquals(valorComissao, 90000.0*0.02);
	}

	//----- corretor ----
	
	
	@Test
	public void verificaComissaoDeCorretoraComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		double valorComissao = calculadora.calcularComissaoPorVenda(venda,criaFuncionarioCorretora());
		Assert.assertEquals(valorComissao, 90000.0*0.03);	
	}
	
	
	//---- corretora ----
	@Test
	public void verificaComissaoDeGerenteComVendaDe2014ComMaisDe60Dias(){
		criaVendaComValorEm2014ComMaisDe60Dias();
		double valorComissao = calculadora.calcularComissaoPorVenda(venda,criaFuncionarioGerente());
		Assert.assertEquals(valorComissao, 90000.0*0.05);	
	}

	
	// ---- gerente -----
	
	
	public void criaVendaComValorEm2015ComMaisDe60Dias(){
		venda = new Venda(90000.0,"01/01/2015");
		calculadora.setDataDoCalculo(FormataDataVenda("03/01/2015"));
	}
	
	public void criaVendaComValorEm2015ComMenosDe60Dias(){
		venda = new Venda(90000.0,"01/01/2015");
		calculadora.setDataDoCalculo(FormataDataVenda("30/01/2015"));
	}
	
	public void criaVendaComValorEm2014ComMaisDe60Dias(){
		venda = new Venda(90000.0,"01/01/2014");
		calculadora.setDataDoCalculo(FormataDataVenda("03/01/2014"));
	}
	
	public void criaVendaComValorEm2014ComMenosDe60Dias(){
		venda = new Venda(90000.0,"01/01/2014");
		calculadora.setDataDoCalculo(FormataDataVenda("30/01/2014"));
	}
	
	
	
	
}
