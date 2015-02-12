package br.com.akato.comissaovenda;


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {
	private BigDecimal valorVenda;
	private Date dataVenda;

	public Date getDataVenda() {
		return dataVenda;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	
	public Venda(BigDecimal valor, String string) {
		this.valorVenda = valor;
		this.dataVenda = FormataDataVenda(string);
	}

	public Venda() {
	}

	private Date FormataDataVenda(String dataSemFormatacao) {
		Date dataFormatada = new Date();
		try {
			dataFormatada = new SimpleDateFormat("dd/MM/yyyy")
					.parse(dataSemFormatacao);

		} catch (Exception e) {
			System.out.println("Houve um problema ao formatar a data");
		}
		return dataFormatada;
	}
	
}
