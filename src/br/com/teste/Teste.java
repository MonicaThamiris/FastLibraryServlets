package br.com.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fastlibrary.dao.PerfilDAO;
import br.com.fastlibrary.entity.Perfil;
import br.com.fastlibrary.entitymanager.EntityManagerFactorySingleton;
import br.com.fiap.impl.PerfilImpl;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
		EntityManager em = f.createEntityManager();

		PerfilDAO perfil = new PerfilImpl(em);
		
		Perfil perfil1 = new Perfil();
		perfil1.setNome("Usuario");
		
		perfil.insert(perfil1);
	}

}
