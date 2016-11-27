package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.builder.FechamentoBuilder;
import br.uninove.cartola.dto.FechamentoDto;
import br.uninove.cartola.mockup.FechamentoDtoMockup;
import br.uninove.cartola.model.Fechamento;

public class FechamentoBuilderApp {

	public static void main(String[] args) {
		List<FechamentoDto> dto = FechamentoDtoMockup.getList();

		for (int i = 0; i < dto.size(); i++) {
			FechamentoDto fechamentoDto = dto.get(i);

			Fechamento fechamento = FechamentoBuilder.build(fechamentoDto);
			System.out.println(fechamento);

		}

	}

}
