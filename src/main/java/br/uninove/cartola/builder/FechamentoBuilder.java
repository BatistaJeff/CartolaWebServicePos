package br.uninove.cartola.builder;

import br.uninove.cartola.dto.FechamentoDto;
import br.uninove.cartola.model.Fechamento;

public class FechamentoBuilder {

	public static Fechamento build(FechamentoDto dto) {

		Fechamento result = new Fechamento();

		result.setDia(dto.getDia_dto());
		result.setMes(dto.getMes_dto());
		result.setAno(dto.getAno_dto());
		result.setHora(dto.getHora_dto());
		result.setMinuto(dto.getMinuto_dto());
		result.setTimestamp(dto.getTimestamp_dto());

		return result;

	}

}
