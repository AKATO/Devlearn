package br.com.akato.comissaovenda;


import java.math.BigDecimal;
import java.util.Date;

public class CalculadoraDeComissao {
	
	private Date dataDoCalculo;
	
	public CalculadoraDeComissao(Date dataDeCalculo){
		this.dataDoCalculo = dataDeCalculo;
	}
	
	
	public BigDecimal calcularComissaoPorVenda(Venda venda, Funcionario funcionario){
		BigDecimal porcentagemComissao = new BigDecimal("0.00");
		BigDecimal valorVenda = new BigDecimal("0.00");
		BigDecimal comissaoDaVenda = new BigDecimal("0.00");
		try {
			if(verificaSePoderaReceberComissao(venda)){
				if(venda!=null && venda.getValorVenda().doubleValue()>0.0){
					
					porcentagemComissao = funcionario.getComissaoPorData(venda.getDataVenda());
					valorVenda = venda.getValorVenda();
					comissaoDaVenda = porcentagemComissao.multiply(valorVenda);
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return comissaoDaVenda;
	}
	
	public Date getDataDoCalculo() {
		return dataDoCalculo;
	}

	private boolean verificaSePoderaReceberComissao(Venda venda){
		
		return (quantidadeDeDiasEntreVendaEDataDeCalculo(venda.getDataVenda()) >=60) ? true : false;
	}
	
	public long quantidadeDeDiasEntreVendaEDataDeCalculo(Date dataDaVenda){
		long dias = (this.dataDoCalculo.getTime() - dataDaVenda.getTime()) / 86400000L;
		return dias;
	}
}
