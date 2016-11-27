package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.builder.AtletaBuilder;
import br.uninove.cartola.dto.AtletaDto;
import br.uninove.cartola.mockup.AtletaDtoMockup;
import br.uninove.cartola.model.Atleta;

public class AtletaBuilderApp {

	public static void main(String[] args) {

		List<AtletaDto> dtos = AtletaDtoMockup.getList();

		for (int i = 0; i < dtos.size(); i++) {
			AtletaDto atletaDto = dtos.get(i);
			Atleta atleta = AtletaBuilder.build(atletaDto);
			System.out.println(atleta);

		}

	}

}
