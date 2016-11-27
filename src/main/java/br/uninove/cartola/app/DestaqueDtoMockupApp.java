package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.dto.DestaqueDto;
import br.uninove.cartola.mockup.DestaqueDtoMockup;

public class DestaqueDtoMockupApp {
	public static void main(String[] args) {
		DestaqueDto destaqueDto = DestaqueDtoMockup.get();
		// System.out.println(destaqueDto);

		List<DestaqueDto> destaqueDtosList = DestaqueDtoMockup.getList();

		for (int i = 0; i < destaqueDtosList.size(); i++) {
			destaqueDto = destaqueDtosList.get(i);
			System.out.println(destaqueDto);

		}
	}
}
