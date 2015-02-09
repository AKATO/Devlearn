package br.com.akato.comissaovenda;

import junit.framework.Assert;

import org.junit.Test;

import static  br.com.akato.comissaovenda.Perfil.*;



public class FuncionarioTest extends Builder{
	

	@Test
	public void verificaSeCorretorPossuiVendaComissaoCorretaEm2014(){
		criaFuncionarioCorretor();
		Assert.assertEquals("A porcentagem do corretor em 2014 deve ser" + CORRETOR.comissaoDoAno(2014), 
				CORRETOR.comissaoDoAno(2014),funcionario.getPerfil().comissaoDoAno(2014));
	}
	
	
	@Test
	public void verificaSeCorretorPossuiVendaComissaoCorretaEm2015(){
		criaFuncionarioCorretor();
		Assert.assertEquals("A porcentagem do corretor em 2015 deve ser" + CORRETOR.comissaoDoAno(2015), 
				CORRETOR.comissaoDoAno(2015),funcionario.getPerfil().comissaoDoAno(2015));
	}
	

	@Test
	public void verificaSeGerentePossuiVendaComissaoCorretaEm2014(){
		criaFuncionarioGerente();
		Assert.assertEquals("A porcentagem do Gerente em 2014 deve ser" + GERENTE.comissaoDoAno(2014), 
				GERENTE.comissaoDoAno(2014),funcionario.getPerfil().comissaoDoAno(2014));
	}
	
	@Test
	public void verificaSeGerentePossuiVendaComissaoCorretaEm2015(){
		criaFuncionarioGerente();
		Assert.assertEquals("A porcentagem do Gerente em 2015 deve ser" + GERENTE.comissaoDoAno(2015), 
				GERENTE.comissaoDoAno(2015),funcionario.getPerfil().comissaoDoAno(2015));
	}
	
	@Test
	public void verificaSeCorretoraPossuiVendaComissaoCorretaEm2014(){
		criaFuncionarioCorretora();
		Assert.assertEquals("A porcentagem da Corretora em 2014 deve ser" + CORRETORA.comissaoDoAno(2014), 
				CORRETORA.comissaoDoAno(2014),funcionario.getPerfil().comissaoDoAno(2014));
	}
	
	@Test
	public void verificaSeCorretoraPossuiVendaComissaoCorretaEm2015(){
		criaFuncionarioCorretora();
		Assert.assertEquals("A porcentagem da Corretora em 2015 deve ser" + CORRETORA.comissaoDoAno(2015), 
				CORRETORA.comissaoDoAno(2015),funcionario.getPerfil().comissaoDoAno(2015));
	}
}