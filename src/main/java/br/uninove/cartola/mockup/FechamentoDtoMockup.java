package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dto.FechamentoDto;

public class FechamentoDtoMockup {

	public static FechamentoDto get() {
		FechamentoDto result = new FechamentoDto();

		result.setDia_dto(1);
		result.setMes_dto(10);
		result.setAno_dto(2016);
		result.setHora_dto(9);
		result.setMinuto_dto(0);
		result.setTimestamp_dto(1475323200);

		return result;
	}

	public static List<FechamentoDto> getList() {

		List<FechamentoDto> result = new ArrayList<FechamentoDto>();
		FechamentoDto fechamento = new FechamentoDto();

		fechamento.setDia_dto(1);
		fechamento.setMes_dto(10);
		fechamento.setAno_dto(2016);
		fechamento.setHora_dto(9);
		fechamento.setMinuto_dto(0);
		fechamento.setTimestamp_dto(1475323200);
		result.add(fechamento);

		fechamento = new FechamentoDto();

		fechamento.setDia_dto(2);
		fechamento.setMes_dto(11);
		fechamento.setAno_dto(2016);
		fechamento.setHora_dto(10);
		fechamento.setMinuto_dto(0);
		fechamento.setTimestamp_dto(1475323200);
		result.add(fechamento);

		return result;

	}
}
