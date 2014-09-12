package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fastlibrary.dao.PerfilDAO;
import br.com.fastlibrary.entity.Perfil;

public class PerfilImpl extends DAOImpl<Perfil, Integer> implements PerfilDAO {

	public PerfilImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
