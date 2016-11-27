package br.uninove.cartola.mockup;

import java.util.ArrayList;
import java.util.List;

import br.uninove.cartola.model.Fechamento;

public class FechamentoMockup {

	public static Fechamento get() {
		Fechamento result = new Fechamento();

		result.setDia(1);
		result.setMes(10);
		result.setAno(2016);
		result.setHora(9);
		result.setMinuto(0);
		result.setTimestamp(1475323200);

		return result;
	}

	public static List<Fechamento> getList() {

		List<Fechamento> result = new ArrayList<Fechamento>();
		Fechamento fechamento = new Fechamento();

		fechamento.setDia(1);
		fechamento.setMes(10);
		fechamento.setAno(2016);
		fechamento.setHora(9);
		fechamento.setMinuto(0);
		fechamento.setTimestamp(1475323200);
		result.add(fechamento);
		
		fechamento = new Fechamento();
		
		fechamento.setDia(2);
		fechamento.setMes(11);
		fechamento.setAno(2016);
		fechamento.setHora(10);
		fechamento.setMinuto(0);
		fechamento.setTimestamp(1475323200);
		result.add(fechamento);
		

		return result;

	}
}
