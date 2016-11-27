package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dto.FechamentoDto;
import br.uninove.cartola.dto.StatusDto;

public class StatusDtoMockup {

	public static StatusDto get() {
		StatusDto result = new StatusDto();
		FechamentoDto fechamento = FechamentoDtoMockup.get();

		result.setRodada_atual_dto(28);
		result.setStatus_mercado_dto(1);
		result.setEsquema_default_id_dto(4);
		result.setCartoleta_inicial_dto(100);
		result.setMax_ligas_free_dto(2);
		result.setMax_ligas_pro_dto(5);
		result.setMax_ligas_matamata_free_dto(5);
		result.setMax_ligas_matamata_pro_dto(5);
		result.setMax_ligas_patrocinadas_free_dto(2);
		result.setMax_ligas_patrocinadas_pro_num_dto(2);
		result.setGame_over_dto(false);
		result.setTimes_escalados_dto(52464);
		result.setFechamentoDto(fechamento);
		result.setMercado_pos_rodada_dto(true);
		result.setAviso_dto("");

		return result;

	}

	public static List<StatusDto> getList() {
		StatusDto status = new StatusDto();
		FechamentoDto fechamento = FechamentoDtoMockup.get();
		List<StatusDto> result = new ArrayList<StatusDto>();

		status.setRodada_atual_dto(28);
		status.setStatus_mercado_dto(1);
		status.setEsquema_default_id_dto(4);
		status.setCartoleta_inicial_dto(100);
		status.setMax_ligas_free_dto(2);
		status.setMax_ligas_pro_dto(5);
		status.setMax_ligas_matamata_free_dto(5);
		status.setMax_ligas_matamata_pro_dto(5);
		status.setMax_ligas_patrocinadas_free_dto(2);
		status.setMax_ligas_patrocinadas_pro_num_dto(2);
		status.setGame_over_dto(false);
		status.setTimes_escalados_dto(52464);
		status.setFechamentoDto(fechamento);
		status.setMercado_pos_rodada_dto(true);
		status.setAviso_dto("");
		result.add(status);

		status = new StatusDto();
		status.setRodada_atual_dto(28);
		status.setStatus_mercado_dto(1);
		status.setEsquema_default_id_dto(4);
		status.setCartoleta_inicial_dto(100);
		status.setMax_ligas_free_dto(2);
		status.setMax_ligas_pro_dto(5);
		status.setMax_ligas_matamata_free_dto(5);
		status.setMax_ligas_matamata_pro_dto(5);
		status.setMax_ligas_patrocinadas_free_dto(2);
		status.setMax_ligas_patrocinadas_pro_num_dto(2);
		status.setGame_over_dto(false);
		status.setTimes_escalados_dto(52464);
		status.setFechamentoDto(fechamento);
		status.setMercado_pos_rodada_dto(true);
		status.setAviso_dto("");
		result.add(status);

		return result;
	}

}
