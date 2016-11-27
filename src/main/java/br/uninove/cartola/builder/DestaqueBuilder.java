package br.uninove.cartola.builder;

import br.uninove.cartola.dto.DestaqueDto;
import br.uninove.cartola.mockup.AtletaMockup;
import br.uninove.cartola.model.Atleta;
import br.uninove.cartola.model.Destaque;

public class DestaqueBuilder {

	public static Destaque build(DestaqueDto dto) {

		Destaque result = new Destaque();
		Atleta atleta = AtletaMockup.get();

		result.setEscalacoes(dto.getEscalacoes_dto());
		result.setClube(dto.getClube_dto());
		result.setEscudo_clube(dto.getEscudo_clube_dto());
		result.setPosicao(dto.getPosicao_dto());
		result.setAtleta(atleta);

		return result;

	}
}