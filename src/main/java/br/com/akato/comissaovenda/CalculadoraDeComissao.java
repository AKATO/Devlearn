package br.com.akato.comissaovenda;

import java.util.Calendar;
import java.util.Date;

public class CalculadoraDeComissao {
	
	private Date dataDoCalculo;
	
	public CalculadoraDeComissao(){
		this.dataDoCalculo = new Date(Calendar.getInstance().getTimeInMillis());
	}
	
	public double calcularComissaoPorVenda(Venda venda, Funcionario funcionario){
		double comissao = 0.0;
		try {
			if(verificaSePoderaReceberComissao(venda)){
				if(venda!=null && venda.getValorVenda()>0){
					
					double valorComissao = funcionario.getPerfil().comissao(venda.pertenceAoAno("2014"));
					double valorVenda = venda.getValorVenda();
					comissao = valorComissao * valorVenda;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return comissao;
	}
	
	public Date getDataDoCalculo() {
		return dataDoCalculo;
	}

	public void setDataDoCalculo(Date dataDoCalculo) {
		this.dataDoCalculo = dataDoCalculo;
	}

	private boolean verificaSePoderaReceberComissao(Venda venda){
		
		return (quantidadeDeDiasEntreVendaEDataDeCalculo(venda.getDataVenda()) >=60) ? true : false;
	}
	
	public long quantidadeDeDiasEntreVendaEDataDeCalculo(Date dataDaVenda){
		long dias = (this.dataDoCalculo.getTime() - dataDaVenda.getTime()) / 86400000L;
		return dias;
	}
}
