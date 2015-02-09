package br.com.akato.comissaovenda;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Builder {
	
	CalculadoraDeComissao calculadora;
	Venda venda;
	Funcionario funcionario;
	
	
	public void inicializaObjetos(){
		calculadora = new CalculadoraDeComissao();
		venda = new Venda();
		funcionario = new Funcionario();
	}
	
	
	protected Venda criaVendaComValorEm2014(double valor, String data){
		Venda venda = new Venda(valor, data);
		return venda;
	}
	

	protected Venda criaVendaComValorEm2015(double valor, String data){
		Venda venda = new Venda(valor, data);
		return venda;
	}
	
	
	public Funcionario criaFuncionario(String perfilFuncionario){
		Funcionario funcionario = new Funcionario(perfilFuncionario);
		return funcionario;
	}
	
	public Date FormataDataVenda(String dataSemFormatacao) {
		Date dataFormatada = new Date();
		try {
			dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(dataSemFormatacao);

		} catch (Exception e) {
			System.out.println("Houve um problema ao formatar a data");
		}
		return dataFormatada;
	}
	
	
	
	public void criaVendaComValorEm2015ComMaisDe60Dias(){
		venda = new Venda(90000.0,"01/01/2015");
		calculadora.setDataDoCalculo(FormataDataVenda("01/04/2015"));
	}
	
	public void criaVendaComValorEm2015ComMenosDe60Dias(){
		venda = new Venda(90000.0,"01/01/2015");
		calculadora.setDataDoCalculo(FormataDataVenda("30/01/2015"));
	}
	
	public void criaVendaComValorEm2014ComMaisDe60Dias(){
		venda = new Venda(90000.0,"02/02/2014");
		calculadora.setDataDoCalculo(FormataDataVenda("05/05/2014"));
	}
	
	public void criaVendaComValorEm2014ComMenosDe60Dias(){
		venda = new Venda(90000.0,"01/01/2014");
		calculadora.setDataDoCalculo(FormataDataVenda("30/01/2014"));
	}
	
	public void criaFuncionarioCorretor(){
		funcionario = new Funcionario("corretor");
	}
	
	public void criaFuncionarioCorretora(){
		funcionario = new Funcionario("corretora");
	}	
	
	public void criaFuncionarioGerente(){
		funcionario = new Funcionario("gerente");
	}
	
}
