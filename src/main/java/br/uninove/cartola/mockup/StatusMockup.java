
package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.model.Fechamento;
import br.uninove.cartola.model.Status;

public class StatusMockup {

	public static Status get() {
		Status result = new Status();
		Fechamento fechamento = FechamentoMockup.get();

		result.setRodada_atual(28);
		result.setStatus_mercado(1);
		result.setEsquema_default_id(4);
		result.setCartoleta_inicial(100);
		result.setMax_ligas_free(2);
		result.setMax_ligas_pro(5);
		result.setMax_ligas_matamata_free(5);
		result.setMax_ligas_matamata_pro(5);
		result.setMax_ligas_patrocinadas_free(2);
		result.setMax_ligas_patrocinadas_pro_num(2);
		result.setGame_over(false);
		result.setTimes_escalados(52464);
		result.setFechamento(fechamento);
		result.setMercado_pos_rodada(true);
		result.setAviso("");

		return result;
	}

	public static List<Status> getList() {
		List<Status> result = new ArrayList<Status>();
		Status status = new Status();
		Fechamento fechamento = FechamentoMockup.get();

		status.setRodada_atual(28);
		status.setStatus_mercado(1);
		status.setEsquema_default_id(4);
		status.setCartoleta_inicial(100);
		status.setMax_ligas_free(2);
		status.setMax_ligas_pro(5);
		status.setMax_ligas_matamata_free(5);
		status.setMax_ligas_matamata_pro(5);
		status.setMax_ligas_patrocinadas_free(2);
		status.setMax_ligas_patrocinadas_pro_num(2);
		status.setGame_over(false);
		status.setTimes_escalados(52464);
		status.setFechamento(fechamento);
		status.setMercado_pos_rodada(true);
		status.setAviso("");
		result.add(status);

		return result;

	}

}
