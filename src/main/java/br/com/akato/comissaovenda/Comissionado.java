package br.com.akato.comissaovenda;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public abstract class Comissionado {

	protected Map<Date, BigDecimal> comissoes;

	protected BigDecimal commissaoPorData(Date data) {

		return comissoes.get(buscaComissao(data));
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
		this.comissoes.put(dataLimite, comissao);
	}

	protected BigDecimal getComissaoPorData(Date dataDeReferencia){
		return this.buscaComissao(dataDeReferencia);
	}
	
	//lookup by date
	protected BigDecimal buscaComissao(Date data) {
		Set<Date> chavesPorData = this.comissoes.keySet();
		Date dataEncontrada = new Date();
		boolean encontrouComissao=false;
		for(Date dataChave:chavesPorData){
			if(data.getTime()>=dataChave.getTime()){
				encontrouComissao = true;
				dataEncontrada = dataChave;
			} 
		}
		return encontrouComissao?this.comissoes.get(dataEncontrada):null;
	}

}
