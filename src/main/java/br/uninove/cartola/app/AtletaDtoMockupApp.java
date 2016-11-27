package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.dto.AtletaDto;
import br.uninove.cartola.mockup.AtletaDtoMockup;

public class AtletaDtoMockupApp {
	public static void main(String[] args) {
		AtletaDto atletaDto = AtletaDtoMockup.get();
//		System.out.println(atletaDto);

		List<AtletaDto> listaAtletas = AtletaDtoMockup.getList();

		for (int i = 0; i < listaAtletas.size(); i++) {

			atletaDto = listaAtletas.get(i);
			System.out.println(atletaDto);

		}

	}
}
