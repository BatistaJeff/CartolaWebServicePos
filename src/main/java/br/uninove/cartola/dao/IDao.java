package br.uninove.cartola.dao;

import java.util.List;

public interface IDao<T> {

	void insert(T model) throws Exception;

	void update(T model) throws Exception;

	void delete(Object id) throws Exception;

	T get(Object id) throws Exception;

	List<T> list() throws Exception;
}
