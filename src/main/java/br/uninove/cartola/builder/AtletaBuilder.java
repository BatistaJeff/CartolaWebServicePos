package br.uninove.cartola.builder;

import br.uninove.cartola.dto.AtletaDto;
import br.uninove.cartola.model.Atleta;

public class AtletaBuilder {

	public static Atleta build(AtletaDto atletaDto) {

		Atleta result = new Atleta();

		result.setId(atletaDto.getAtleta_id_dto());
		result.setNome(atletaDto.getNome_dto());
		result.setApelido(atletaDto.getApelido_dto());
		result.setFoto(atletaDto.getFoto_dto());
		result.setPreco_editorial(atletaDto.getPreco_editorial_dto());

		return result;

	}
}
