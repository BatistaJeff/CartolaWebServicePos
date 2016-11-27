package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dto.DestaqueDto;
import br.uninove.cartola.model.Atleta;

public class DestaqueDtoMockup {

	public static DestaqueDto get() {

		DestaqueDto result = new DestaqueDto();
		Atleta atleta = AtletaMockup.get();

		result.setEscalacoes_dto(680017);
		result.setClube_dto("FLU");
		result.setEscudo_clube_dto("https://s.glbimg.com/es/sde/f/equipes/2015/07/21/fluminense_60x60.png");
		result.setPosicao_dto("Meia");
		result.setAtleta_dto(atleta);

		return result;
	}

	public static List<DestaqueDto> getList() {

		List<DestaqueDto> result = new ArrayList<DestaqueDto>();
		DestaqueDto destaque = new DestaqueDto();

		Atleta atleta = AtletaMockup.get();

		destaque.setEscalacoes_dto(680017);
		destaque.setClube_dto("FLU");
		destaque.setEscudo_clube_dto("https://s.glbimg.com/es/sde/f/equipes/2015/07/21/fluminense_60x60.png");
		destaque.setPosicao_dto("Meia");
		destaque.setAtleta_dto(atleta);
		result.add(destaque);

		destaque = new DestaqueDto();

		destaque.setEscalacoes_dto(62161);
		destaque.setClube_dto("FLA");
		destaque.setEscudo_clube_dto("https://s.glbimg.com/es/sde/f/equipes/2015/07/21/fluminense_60x60.png");
		destaque.setPosicao_dto("Meia");
		destaque.setAtleta_dto(atleta);
		result.add(destaque);

		return result;

	}
	
	
}
