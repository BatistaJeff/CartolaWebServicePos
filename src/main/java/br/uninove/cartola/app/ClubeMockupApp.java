package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.mockup.ClubeMockup;
import br.uninove.cartola.model.Clube;

public class ClubeMockupApp {
	public static void main(String[] args) {
		Clube clube = ClubeMockup.get();

		// System.out.println(clube);

		List<Clube> listaClubes = ClubeMockup.getList();

		for (int i = 0; i < listaClubes.size(); i++) {
			clube = listaClubes.get(i);
			System.out.println(clube);
		}

	}
}
