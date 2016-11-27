package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.mockup.StatusMockup;
import br.uninove.cartola.model.Status;

public class StatusMockupApp {

	public static void main(String[] args) {

		Status status = StatusMockup.get();

		// System.out.println(status);

		List<Status> listaStatus = StatusMockup.getList();

		for (int i = 0; i < listaStatus.size(); i++) {
			status = listaStatus.get(i);
			System.out.println(status);
		}

	}
}
