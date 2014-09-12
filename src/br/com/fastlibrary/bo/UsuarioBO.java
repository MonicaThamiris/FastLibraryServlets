package br.com.fastlibrary.bo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fastlibrary.dao.UsuarioDAO;
import br.com.fastlibrary.entity.Usuario;
import br.com.fastlibrary.entitymanager.EntityManagerFactorySingleton;
import br.com.fastlibrary.validate.UsuarioValidate;
import br.com.fiap.impl.UsuarioImpl;

public class UsuarioBO implements InterBO<Usuario, Integer>{

	EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
	EntityManager em = f.createEntityManager();
	private UsuarioDAO usuarioDAO;
	
	@Override
	public void insert(Usuario usuario) {
		usuarioDAO  = new UsuarioImpl(em);
		UsuarioValidate.validar(usuario);
		usuarioDAO.insert(usuario);
	}

	@Override
	public void remove(Usuario usuario) {
		usuarioDAO  = new UsuarioImpl(em);
		usuarioDAO.remove(usuario);
	}

	@Override
	public void update(Usuario usuario) {
		usuarioDAO = new UsuarioImpl(em);
		usuarioDAO.update(usuario);
	}

	@Override
	public Usuario findById(Integer id) {
		usuarioDAO = new UsuarioImpl(em);
		Usuario usuario = usuarioDAO.findById(id);
		return usuario;
	}
	
}
