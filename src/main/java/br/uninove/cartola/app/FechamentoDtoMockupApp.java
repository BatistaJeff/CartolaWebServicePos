package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.dto.FechamentoDto;
import br.uninove.cartola.mockup.FechamentoDtoMockup;

public class FechamentoDtoMockupApp {
	public static void main(String[] args) {

		FechamentoDto fechamentoDto = FechamentoDtoMockup.get();
		// System.out.println(fechamentoDto);

		List<FechamentoDto> listaFechamentoDto = FechamentoDtoMockup.getList();

		for (int i = 0; i < listaFechamentoDto.size(); i++) {
			fechamentoDto = listaFechamentoDto.get(i);
			System.out.println(fechamentoDto);
		}

	}
}
