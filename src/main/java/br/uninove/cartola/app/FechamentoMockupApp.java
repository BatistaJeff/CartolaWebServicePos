package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.mockup.FechamentoMockup;
import br.uninove.cartola.model.Fechamento;

public class FechamentoMockupApp {
	public static void main(String[] args) {

		Fechamento fechamento = FechamentoMockup.get();
		List<Fechamento> listaFechamento = FechamentoMockup.getList();

		// System.out.println(fechamento);

		for (int i = 0; i < listaFechamento.size(); i++) {
			fechamento = listaFechamento.get(i);
			System.out.println(fechamento);
		}

	}
}
