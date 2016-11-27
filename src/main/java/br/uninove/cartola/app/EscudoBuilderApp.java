package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.builder.EscudoBuilder;
import br.uninove.cartola.dto.EscudoDto;
import br.uninove.cartola.mockup.EscudoDtoMockup;
import br.uninove.cartola.model.Escudo;

public class EscudoBuilderApp {

	public static void main(String[] args) {

		List<EscudoDto> escudoDtoLista = EscudoDtoMockup.getList();

		for (int i = 0; i < escudoDtoLista.size(); i++) {
			EscudoDto escudoDto = escudoDtoLista.get(i);
			Escudo escudo = EscudoBuilder.build(escudoDto);
			System.out.println(escudo);
		}

	}
}
