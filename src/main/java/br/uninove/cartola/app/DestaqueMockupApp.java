package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.mockup.DestaqueMockup;
import br.uninove.cartola.model.Destaque;

public class DestaqueMockupApp {
	public static void main(String[] args) {

		Destaque destaque = DestaqueMockup.get();

//		System.out.println(destaque);
		
		
		List<Destaque> destaquesLista = DestaqueMockup.getList();
		
		for (int i = 0; i < destaquesLista.size(); i++) {
			destaque = destaquesLista.get(i);
			System.out.println(destaque);
			
			
		}

	}

}
