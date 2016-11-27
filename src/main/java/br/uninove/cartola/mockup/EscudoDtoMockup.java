package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dto.EscudoDto;

public class EscudoDtoMockup {
	public static EscudoDto get() {

		EscudoDto result = new EscudoDto();

		result.setTamanho_60x60_dto("");
		result.setTamanho_45x45_dto("");
		result.setTamanho_30x30_dto("");

		return result;
	}

	public static List<EscudoDto> getList() {

		List<EscudoDto> result = new ArrayList<EscudoDto>();

		EscudoDto escudo = new EscudoDto();

		escudo.setTamanho_60x60_dto("");
		escudo.setTamanho_45x45_dto("");
		escudo.setTamanho_30x30_dto("");
		result.add(escudo);

		escudo = new EscudoDto();
		escudo.setTamanho_60x60_dto("https://s.glbimg.com/es/sde/f/equipes/2014/04/14/flamengo_60x60.png");
		escudo.setTamanho_45x45_dto("https://s.glbimg.com/es/sde/f/equipes/2013/12/16/flamengo_45x45.png");
		escudo.setTamanho_30x30_dto("https://s.glbimg.com/es/sde/f/equipes/2013/12/16/botafogo_30x30.png");

		result.add(escudo);

		return result;
	}
}
