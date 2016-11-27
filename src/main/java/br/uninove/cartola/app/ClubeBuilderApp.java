package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.builder.ClubeBuilder;
import br.uninove.cartola.dto.ClubeDto;
import br.uninove.cartola.mockup.ClubeDtoMockup;
import br.uninove.cartola.model.Clube;

public class ClubeBuilderApp {
	public static void main(String[] args) {

		List<ClubeDto> clubeDtosLista = ClubeDtoMockup.getList();

		for (int i = 0; i < clubeDtosLista.size(); i++) {
			ClubeDto clubeDto = clubeDtosLista.get(i);
			Clube clube = ClubeBuilder.build(clubeDto);
			System.out.println(clube);
		}

	}
}
