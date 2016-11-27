package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.dto.ClubeDto;
import br.uninove.cartola.mockup.ClubeDtoMockup;

public class ClubeDtoMockupApp {
	public static void main(String[] args) {

		ClubeDto clubeDto = ClubeDtoMockup.get();
		// System.out.println(clubeDto);

		List<ClubeDto> clubeDtoLista = ClubeDtoMockup.getList();

		for (int i = 0; i < clubeDtoLista.size(); i++) {
			clubeDto = clubeDtoLista.get(i);
			System.out.println(clubeDto);
		}

	}
}
