package br.edu.utfpr.dv.siacoes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class TemplateDAO<T> {

	abstract public T findById(int id) throws SQLException;
	
	abstract T loadObject(ResultSet rs) throws SQLException;
	
}


