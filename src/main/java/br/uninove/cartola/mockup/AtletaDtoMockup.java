package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.dto.AtletaDto;

public class AtletaDtoMockup {

	public static AtletaDto get() {
		AtletaDto result = new AtletaDto();

		result.setAtleta_id_dto(87999);
		result.setNome_dto("Gustavo Henrique Furtado Scarpa");
		result.setApelido_dto("Gustavo Scarpa");
		result.setFoto_dto("https://s.glbimg.com/es/sde/f/2016/04/29/6e433eb3cd2ccb3fe639c110479ebf7c_FORMATO.png");
		result.setPreco_editorial_dto(12);

		return result;
	}

	public static List<AtletaDto> getList() {

		List<AtletaDto> result = new ArrayList<AtletaDto>();
		AtletaDto atleta = new AtletaDto();

		atleta.setAtleta_id_dto(87999);
		atleta.setNome_dto("Gustavo Henrique Furtado Scarpa");
		atleta.setApelido_dto("Gustavo Scarpa");
		atleta.setFoto_dto("https://s.glbimg.com/es/sde/f/2016/04/29/6e433eb3cd2ccb3fe639c110479ebf7c_FORMATO.png");
		atleta.setPreco_editorial_dto(12);
		result.add(atleta);

		atleta = new AtletaDto();
		atleta.setAtleta_id_dto(38909);
		atleta.setNome_dto("Diego Ribas da Cunha");
		atleta.setApelido_dto("Diego");
		atleta.setFoto_dto("https://s.glbimg.com/es/sde/f/2016/04/29/6e433eb3cd2ccb3fe639c110479ebf7c_FORMATO.png");
		atleta.setPreco_editorial_dto(10);
		result.add(atleta);

		return result;

	}
	
}
