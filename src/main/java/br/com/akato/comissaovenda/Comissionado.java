package br.com.akato.comissaovenda;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public abstract class Comissionado {

	protected Map<Integer, BigDecimal> comissoes;

	protected BigDecimal commissaoAno(Date data) {

		return comissoes.get(getAno(data));
	}

	/*
	 * 
	 * CORRETOR;31/01/2014;0.03
	 */

	protected void carregarComissoes(Perfil perfil) {
		LeitorDeTabelaDeComissao leitorDeComissoes = new LeitorDeTabelaDeComissao();
		try {
			Collection<String> comissoes = leitorDeComissoes.lerComissoes();
			for (String linhaDecomissao : comissoes) {
				String[] dados = linhaDecomissao.split(";");
				String perfilDoComissionado = dados[0];
				Date dataLimiteComissao = new SimpleDateFormat("dd/MM/yyyy")
				.parse(dados[1]);
				BigDecimal valorComissao = new BigDecimal(dados[2]);
				if (perfilDoComissionado.equals(perfil.toString())) {
					this.adicionaComissao(dataLimiteComissao, valorComissao);
				}
			}	
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void adicionaComissao(Date dataLimite, BigDecimal comissao) {
		this.comissoes.put(getAno(dataLimite), comissao);
	}

	protected BigDecimal getComissaoPorData(Date dataDeReferencia){
		return this.comissoes.get(getAno(dataDeReferencia));
	}
	
	protected int getAno(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int ano = cal.get(Calendar.YEAR);
		return ano;
	}

}
