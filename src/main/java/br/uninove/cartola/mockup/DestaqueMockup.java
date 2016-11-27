package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.model.Atleta;
import br.uninove.cartola.model.Destaque;

public class DestaqueMockup {

	public static Destaque get() {

		Destaque result = new Destaque();
		Atleta atleta = AtletaMockup.get();

		result.setEscalacoes(680017);
		result.setClube("FLU");
		result.setEscudo_clube("https://s.glbimg.com/es/sde/f/equipes/2015/07/21/fluminense_60x60.png");
		result.setPosicao("Meia");
		result.setAtleta(atleta);

		return result;
	}

	public static List<Destaque> getList() {

		List<Destaque> result = new ArrayList<Destaque>();
		Destaque destaque = new Destaque();

		Atleta atleta = AtletaMockup.get();

		destaque.setEscalacoes(680017);
		destaque.setClube("FLU");
		destaque.setEscudo_clube("https://s.glbimg.com/es/sde/f/equipes/2015/07/21/fluminense_60x60.png");
		destaque.setPosicao("Meia");
		destaque.setAtleta(atleta);
		result.add(destaque);

		destaque = new Destaque();

		destaque.setEscalacoes(62161);
		destaque.setClube("FLA");
		destaque.setEscudo_clube("https://s.glbimg.com/es/sde/f/equipes/2015/07/21/fluminense_60x60.png");
		destaque.setPosicao("Meia");
		destaque.setAtleta(atleta);
		result.add(destaque);

		return result;

	}

}
