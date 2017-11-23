package br.com.inovamobil.reader.servico.entidades;

import android.content.Context;
import br.com.inovamobil.reader.dominio.entidade.Bairro;
import br.com.inovamobil.reader.servico.entidades.base.AServicoBase;
import br.com.inovamobil.reader.util.Geral;

public class ServicoBairro extends AServicoBase<Bairro>{

	public ServicoBairro(Context ctxContexto, String strCaminhoBancoDados) {
		super(ctxContexto, strCaminhoBancoDados ,new Bairro());
	}
	
	public ServicoBairro(Context ctxContexto) {
		super(ctxContexto, Geral.CAMINHO_ARQUIVO_BANCO_DADOS, new Bairro());
	}	
}
