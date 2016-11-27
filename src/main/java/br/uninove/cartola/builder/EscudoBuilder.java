package br.uninove.cartola.builder;

import br.uninove.cartola.dto.EscudoDto;
import br.uninove.cartola.model.Escudo;

public class EscudoBuilder {

	public static Escudo build(EscudoDto escudoDto) {

		Escudo result = new Escudo();

		result.setTamanho_60x60(escudoDto.getTamanho_60x60_dto());
		result.setTamanho_45x45(escudoDto.getTamanho_45x45_dto());
		result.setTamanho_30x30(escudoDto.getTamanho_30x30_dto());

		return result;

	}
}
