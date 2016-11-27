package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.dto.StatusDto;
import br.uninove.cartola.mockup.StatusDtoMockup;

public class StatusDtoMockupApp {
	public static void main(String[] args) {
		StatusDto status = StatusDtoMockup.get();

//		System.out.println(status);

		List<StatusDto> listaStatusDto = StatusDtoMockup.getList();

		for (int i = 0; i < listaStatusDto.size(); i++) {
			status = listaStatusDto.get(i);
			System.out.println(status);
		}

	}

}
