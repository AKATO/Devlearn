package br.com.akato.comissaovenda;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Venda {
	private double valorVenda;
	private Date dataVenda;

	public Date getDataVenda() {
		return dataVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public Venda(double valor, String string) {
		this.valorVenda = valor;
		this.dataVenda = FormataDataVenda(string);
	}

	public Venda() {
	}

	public int getAnoDeVenda(){
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(this.dataVenda.getTime());
		int ano = cal.get(Calendar.YEAR);
		return ano;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataVenda == null) ? 0 : dataVenda.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorVenda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (dataVenda == null) {
			if (other.dataVenda != null)
				return false;
		} else if (!dataVenda.equals(other.dataVenda))
			return false;
		if (Double.doubleToLongBits(valorVenda) != Double
				.doubleToLongBits(other.valorVenda))
			return false;
		return true;
	}
	
	
}
