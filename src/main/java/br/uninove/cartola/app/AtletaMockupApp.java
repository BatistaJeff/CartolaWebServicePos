package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.mockup.AtletaMockup;
import br.uninove.cartola.model.Atleta;

public class AtletaMockupApp {
	public static void main(String[] args) {

		Atleta atleta = AtletaMockup.get();
		// System.out.println(atleta);

		List<Atleta> atletaLista = AtletaMockup.getList();

		for (int i = 0; i < atletaLista.size(); i++) {
			atleta = atletaLista.get(i);
			System.out.println(atleta);
		}

	}

}
