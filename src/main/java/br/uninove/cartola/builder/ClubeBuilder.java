package br.uninove.cartola.builder;

import br.uninove.cartola.dto.ClubeDto;
import br.uninove.cartola.mockup.EscudoMockup;
import br.uninove.cartola.model.Clube;
import br.uninove.cartola.model.Escudo;

public class ClubeBuilder {

	public static Clube build(ClubeDto clubeDto) {

		Clube result = new Clube();
		Escudo escudo = EscudoMockup.get();

		result.setId(clubeDto.getId_dto());
		result.setNome(clubeDto.getNome_dto());
		result.setAbreviacao(clubeDto.getAbreviacao_dto());
//		result.setEscudo(escudo);

		return result;
	}

}
