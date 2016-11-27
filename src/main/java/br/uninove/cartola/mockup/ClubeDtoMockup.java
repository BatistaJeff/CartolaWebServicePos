package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dto.ClubeDto;
import br.uninove.cartola.dto.EscudoDto;

public class ClubeDtoMockup {
	public static ClubeDto get() {

		ClubeDto result = new ClubeDto();
		EscudoDto escudo = EscudoDtoMockup.get();

		result.setId_dto(1);
		result.setNome_dto("Outros");
		result.setAbreviacao_dto("OUT");
		result.setPosicao_dto(1);
		result.setEscudo_dto(escudo);

		return result;

	}

	public static List<ClubeDto> getList() {

		List<ClubeDto> result = new ArrayList<ClubeDto>();
		EscudoDto escudo = EscudoDtoMockup.get();
		ClubeDto clube = new ClubeDto();

		clube.setId_dto(262);
		clube.setNome_dto("flamengo");
		clube.setAbreviacao_dto("FLA");
		clube.setPosicao_dto(2);
		clube.setEscudo_dto(escudo);
		result.add(clube);

		clube = new ClubeDto();

		clube.setId_dto(2554);
		clube.setNome_dto("botafogo");
		clube.setAbreviacao_dto("BOT");
		clube.setPosicao_dto(8);
		clube.setEscudo_dto(escudo);
		result.add(clube);

		return result;

	}
}
