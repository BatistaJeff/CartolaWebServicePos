package br.uninove.cartola.builder;

import br.uninove.cartola.dto.StatusDto;
import br.uninove.cartola.mockup.FechamentoMockup;
import br.uninove.cartola.model.Fechamento;
import br.uninove.cartola.model.Status;

public class StatusBuilder {

	public static Status build(StatusDto statusDto) {
		Status result = new Status();
		Fechamento fechamento = FechamentoMockup.get();

		result.setRodada_atual(statusDto.getRodada_atual_dto());
		result.setStatus_mercado(statusDto.getStatus_mercado_dto());
		result.setEsquema_default_id(statusDto.getEsquema_default_id_dto());
		result.setCartoleta_inicial(statusDto.getCartoleta_inicial_dto());
		result.setMax_ligas_free(statusDto.getMax_ligas_free_dto());
		result.setMax_ligas_pro(statusDto.getMax_ligas_pro_dto());
		result.setMax_ligas_matamata_free(statusDto.getMax_ligas_matamata_free_dto());
		result.setMax_ligas_matamata_pro(statusDto.getMax_ligas_matamata_pro_dto());
		result.setMax_ligas_patrocinadas_free(statusDto.getMax_ligas_patrocinadas_free_dto());
		result.setMax_ligas_patrocinadas_pro_num(statusDto.getMax_ligas_patrocinadas_pro_num_dto());
		result.setGame_over(statusDto.isGame_over_dto());
		result.setTimes_escalados(statusDto.getTimes_escalados_dto());
		result.setFechamento(fechamento);
		result.setMercado_pos_rodada(true);
		result.setAviso("");

		return result;

	}

}
