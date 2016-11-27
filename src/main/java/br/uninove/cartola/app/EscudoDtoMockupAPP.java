package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.dto.EscudoDto;
import br.uninove.cartola.mockup.EscudoDtoMockup;

public class EscudoDtoMockupAPP {
	public static void main(String[] args) {

		EscudoDto escudoDto = EscudoDtoMockup.get();
		// System.out.println(escudoDto);

		List<EscudoDto> escudoLista = EscudoDtoMockup.getList();

		for (int i = 0; i < escudoLista.size(); i++) {
			escudoDto = escudoLista.get(i);
			System.out.println(escudoDto);

		}

	}
}
