package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.model.Clube;
import br.uninove.cartola.model.Escudo;

public class ClubeMockup {

	public static Clube get() {

		Clube result = new Clube();
		Escudo escudo = EscudoMockup.get();

		result.setId(1);
		result.setNome("Outros");
		result.setAbreviacao("OUT");
		result.setPosicao(1);
//		result.setEscudo(escudo);

		return result;

	}

	public static List<Clube> getList() {

		List<Clube> result = new ArrayList<Clube>();
		Escudo escudo = EscudoMockup.get();
		Clube clube = new Clube();

		clube.setId(262);
		clube.setNome("flamengo");
		clube.setAbreviacao("FLA");
		clube.setPosicao(2);
//		clube.setEscudo(escudo);
		result.add(clube);

		clube = new Clube();

		clube.setId(262);
		clube.setNome("botafogo");
		clube.setAbreviacao("BOT");
		clube.setPosicao(8);
//		clube.setEscudo(escudo);
		result.add(clube);

		return result;

	}

}
