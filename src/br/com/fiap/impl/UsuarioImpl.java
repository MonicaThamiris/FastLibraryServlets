package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fastlibrary.dao.UsuarioDAO;
import br.com.fastlibrary.entity.Usuario;

public class UsuarioImpl extends DAOImpl<Usuario, Integer> implements UsuarioDAO {

	public UsuarioImpl(EntityManager em) {
		super(em);
	}

}
