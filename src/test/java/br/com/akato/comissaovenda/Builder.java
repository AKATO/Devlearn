package br.com.akato.comissaovenda;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Builder {
	protected Funcionario criaFuncionarioCorretor(){
		Funcionario corretor = new Funcionario("corretor");
		return corretor;
	}
	
	protected Funcionario criaFuncionarioCorretora(){
		Funcionario corretora = new Funcionario("corretora");
		return corretora;
	}	
	
	protected Funcionario criaFuncionarioGerente(){
		Funcionario gerente = new Funcionario("gerente");
		return gerente;
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
	
	public void adicionaVenda(Funcionario funcionario, double valorVenda, String data){
		funcionario.addVenda(new Venda(valorVenda,data));
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
	
}
