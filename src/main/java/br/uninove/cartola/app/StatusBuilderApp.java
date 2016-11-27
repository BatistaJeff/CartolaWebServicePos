package br.uninove.cartola.app;

import java.util.List;

import br.uninove.cartola.builder.StatusBuilder;
import br.uninove.cartola.dto.StatusDto;
import br.uninove.cartola.mockup.StatusDtoMockup;
import br.uninove.cartola.model.Status;

public class StatusBuilderApp {
	public static void main(String[] args) {

		List<StatusDto> dtos = StatusDtoMockup.getList();
		
		
		for (int i = 0; i < dtos.size(); i++) {
			StatusDto statusDto = dtos.get(i);
			
			Status status = StatusBuilder.build(statusDto);
			
			System.out.println(status);
			System.out.println("***************************");
			
			
			
		}
	
	}
}
