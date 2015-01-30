package br.com.akato.comissaovenda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Venda {
	private double valorVenda;
	private Date dataVenda;

	public Date getDataVenda() {
		return dataVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Venda(double valor, String string) {
		this.valorVenda = valor;
		this.dataVenda = FormataDataVenda(string);
	}

	public Venda() {
	}

	public boolean pertenceAoAno(String ano) {
		Date dataLimite = this.FormataDataVenda("31/12/" + ano);
		return this.dataVenda.getTime() <= dataLimite.getTime();
	}

	private Date FormataDataVenda(String dataSemFormatacao) {
		Date dataFormatada = new Date();
		try {
			dataFormatada = new SimpleDateFormat("dd/mm/yyyy")
					.parse(dataSemFormatacao);

		} catch (Exception e) {
			System.out.println("Houve um problema ao formatar a data");
		}
		return dataFormatada;
	}

	public boolean vendaFoiFeitaEm2014() {
		if (this.getDataVenda().getYear() <= 2014) {
			return true;
		}
		return false;
	}
}
