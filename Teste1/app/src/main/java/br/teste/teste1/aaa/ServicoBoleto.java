package br.com.inovamobil.reader.servico.entidades;

import android.content.Context;
import br.com.inovamobil.reader.dominio.entidade.Boleto;
import br.com.inovamobil.reader.servico.entidades.base.AServicoBase;
import br.com.inovamobil.reader.util.Geral;

public class ServicoBoleto extends AServicoBase<Boleto> {

	public ServicoBoleto(Context ctxContexto, String strCaminhoBancoDados) {
		super(ctxContexto, strCaminhoBancoDados, new Boleto());
	}

	public ServicoBoleto(Context ctxContexto) {
		super(ctxContexto, Geral.CAMINHO_ARQUIVO_BANCO_DADOS, new Boleto());
	}
}
