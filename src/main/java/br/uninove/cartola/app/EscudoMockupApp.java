package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.mockup.EscudoMockup;
import br.uninove.cartola.model.Escudo;

public class EscudoMockupApp {

	public static void main(String[] args) {
		Escudo escudo = EscudoMockup.get();
		// System.out.println(escudo);

		List<Escudo> escudoList = EscudoMockup.getList();

		for (int i = 0; i < escudoList.size(); i++) {
			escudo = escudoList.get(i);
			System.out.println(escudo);
		}
	}

}
