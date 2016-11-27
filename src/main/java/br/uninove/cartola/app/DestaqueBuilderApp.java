package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.builder.DestaqueBuilder;
import br.uninove.cartola.dto.DestaqueDto;
import br.uninove.cartola.mockup.DestaqueDtoMockup;
import br.uninove.cartola.model.Destaque;

public class DestaqueBuilderApp {

	public static void main(String[] args) {
		List<DestaqueDto> dtos = DestaqueDtoMockup.getList();

		for (int i = 0; i < dtos.size(); i++) {
			DestaqueDto destaqueDto = dtos.get(i);
			Destaque destaque = DestaqueBuilder.build(destaqueDto);
			System.out.println(destaque);

		}

	}

}
