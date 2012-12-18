package tn.esprit.soutenanceApplication.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.soutenanceApplication.dao.interfaces.EnseignantDaoLocal;
import tn.esprit.soutenanceApplication.dao.interfaces.EnseignantDaoRemote;
import tn.esprit.soutenanceApplication.persistence.Enseignant;

/**
 * Session Bean implementation class EnseignantDao
 */
@Stateless
public class EnseignantDao implements EnseignantDaoRemote, EnseignantDaoLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EnseignantDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Enseignant enseignant) {
		entityManager.persist(enseignant);
		System.out.println("ok");

	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.find(Enseignant.class, id));
		System.out.println("ok");

	}

	@Override
	public Enseignant findEnseignantById(int id) {

		return entityManager.find(Enseignant.class, id);
	}

	@Override
	public List<Enseignant> findall() {

		return entityManager.createQuery("select e from Enseignant e")
				.getResultList();
	}

	@Override
	public void update(Enseignant enseignant) {
		entityManager.merge(enseignant);
		System.out.println("ok");

	}

}
