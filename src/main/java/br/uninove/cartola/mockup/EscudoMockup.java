package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.model.Escudo;

public class EscudoMockup {

	public static Escudo get() {

		Escudo result = new Escudo();

		result.setTamanho_60x60("");
		result.setTamanho_45x45("");
		result.setTamanho_30x30("");

		return result;
	}

	public static List<Escudo> getList() {

		List<Escudo> result = new ArrayList<Escudo>();

		Escudo escudo = new Escudo();

		escudo.setTamanho_60x60("");
		escudo.setTamanho_45x45("");
		escudo.setTamanho_30x30("");
		result.add(escudo);

		escudo = new Escudo();
		escudo.setTamanho_60x60("https://s.glbimg.com/es/sde/f/equipes/2014/04/14/flamengo_60x60.png");
		escudo.setTamanho_45x45("https://s.glbimg.com/es/sde/f/equipes/2013/12/16/flamengo_45x45.png");
		escudo.setTamanho_30x30("https://s.glbimg.com/es/sde/f/equipes/2013/12/16/botafogo_30x30.png");

		result.add(escudo);

		return result;
	}

}
