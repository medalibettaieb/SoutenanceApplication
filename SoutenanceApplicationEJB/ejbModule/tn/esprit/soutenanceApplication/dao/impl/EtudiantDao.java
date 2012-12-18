package tn.esprit.soutenanceApplication.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.soutenanceApplication.dao.interfaces.EtudiantDaoLocal;
import tn.esprit.soutenanceApplication.dao.interfaces.EtudiantDaoRemote;
import tn.esprit.soutenanceApplication.persistence.Etudiant;

/**
 * Session Bean implementation class EtudiantDao
 */
@Stateless
public class EtudiantDao implements EtudiantDaoRemote, EtudiantDaoLocal {

	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public EtudiantDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void add(Etudiant etudiant) {
		entityManager.persist(etudiant);
		System.out.println("ok");
		
	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.find(Etudiant.class, id));
		System.out.println("ok");
		
	}

	@Override
	public Etudiant findEtudiantById(int id) {
	
		return entityManager.find(Etudiant.class, id);
	}

	@Override
	public List<Etudiant> findall() {
		
		return entityManager.createQuery("select from e Etudiant e ").getResultList();
	}

	@Override
	public void update(Etudiant etudiant) {
		entityManager.merge(etudiant);
		System.out.println("ok");
		
	}

}
