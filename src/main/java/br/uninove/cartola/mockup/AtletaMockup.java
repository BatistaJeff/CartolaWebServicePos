package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.model.Atleta;

public class AtletaMockup {

	public static Atleta get() {
		Atleta result = new Atleta();

		result.setId(87999);
		result.setNome("Gustavo Henrique Furtado Scarpa");
		result.setApelido("Gustavo Scarpa");
		result.setFoto("https://s.glbimg.com/es/sde/f/2016/04/29/6e433eb3cd2ccb3fe639c110479ebf7c_FORMATO.png");
		result.setPreco_editorial(12);

		return result;
	}

	public static List<Atleta> getList() {

		List<Atleta> result = new ArrayList<Atleta>();
		Atleta atleta = new Atleta();

		atleta.setId(87999);
		atleta.setNome("Gustavo Henrique Furtado Scarpa");
		atleta.setApelido("Gustavo Scarpa");
		atleta.setFoto("https://s.glbimg.com/es/sde/f/2016/04/29/6e433eb3cd2ccb3fe639c110479ebf7c_FORMATO.png");
		atleta.setPreco_editorial(12);
		result.add(atleta);

		atleta = new Atleta();
		atleta.setId(38909);
		atleta.setNome("Diego Ribas da Cunha");
		atleta.setApelido("Diego");
		atleta.setFoto("https://s.glbimg.com/es/sde/f/2016/04/29/6e433eb3cd2ccb3fe639c110479ebf7c_FORMATO.png");
		atleta.setPreco_editorial(10);
		result.add(atleta);

		return result;

	}

}
