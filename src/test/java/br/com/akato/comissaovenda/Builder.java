package br.com.akato.comissaovenda;
import static br.com.akato.comissaovenda.Perfil.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Builder {
	
	CalculadoraDeComissao calculadora;
	Venda venda;
	Funcionario corretor;
	Funcionario corretora;
	Funcionario gerente;
	
	protected void inicializarFuncionarios(){
		criaFuncionarioCorretor();
		criaFuncionarioCorretora();
		criaFuncionarioGerente();
	}
	
	
	protected Venda criaVendaComValorEm2014(BigDecimal valor, String data){
		Venda venda = new Venda(valor, data);
		return venda;
	}
	

	protected Venda criaVendaComValorEm2015(BigDecimal valor, String data){
		Venda venda = new Venda(valor, data);
		return venda;
	}
	
	
	protected Funcionario criaFuncionario(Perfil perfilFuncionario){
		Funcionario funcionario = new Funcionario(perfilFuncionario);
		return funcionario;
	}
	
	protected Date FormataDataVenda(String dataSemFormatacao) {
		Date dataFormatada = new Date();
		try {
			dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(dataSemFormatacao);

		} catch (Exception e) {
			System.out.println("Houve um problema ao formatar a data");
		}
		return dataFormatada;
	}
	
	
	
	protected void criaVendaComValorEm2015ComMaisDe60Dias(){
		venda = new Venda(new BigDecimal(90000.0),"01/01/2015");
		calculadora = new CalculadoraDeComissao(FormataDataVenda("01/04/2015"));
	}
	
	protected void criaVendaComValorEm2015ComMenosDe60Dias(){
		venda = new Venda(new BigDecimal(90000.0),"01/01/2015");
		calculadora = new CalculadoraDeComissao(FormataDataVenda("30/01/2015"));
	}
	
	protected void criaVendaComValorEm2014ComMaisDe60Dias(){
		venda = new Venda(new BigDecimal(90000.0),"02/02/2014");
		calculadora = new CalculadoraDeComissao(FormataDataVenda("05/05/2014"));
	}
	
	protected void criaVendaComValorEm2014ComMenosDe60Dias(){
		venda = new Venda(new BigDecimal(90000.0),"01/01/2014");
		calculadora =new CalculadoraDeComissao(FormataDataVenda("30/01/2014"));
	}
	
	protected void criaFuncionarioCorretor(){
		corretor = new Funcionario(CORRETOR);
	}
	
	protected void criaFuncionarioCorretora(){
		corretora = new Funcionario(CORRETORA);
	}	
	
	protected void criaFuncionarioGerente(){
		gerente = new Funcionario(GERENTE);
	}
	
	protected int getAnoVenda(Venda venda){
		Calendar cal = Calendar.getInstance();
		cal.setTime(venda.getDataVenda());
		return cal.get(Calendar.YEAR);
	}
	
}
