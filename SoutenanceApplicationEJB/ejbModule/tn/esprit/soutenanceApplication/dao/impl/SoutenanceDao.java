package tn.esprit.soutenanceApplication.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.soutenanceApplication.dao.interfaces.SoutenanceDaoLocal;
import tn.esprit.soutenanceApplication.dao.interfaces.SoutenanceDaoRemote;
import tn.esprit.soutenanceApplication.persistence.Soutenance;

/**
 * Session Bean implementation class SoutenanceDao
 */
@Stateless
public class SoutenanceDao implements SoutenanceDaoRemote, SoutenanceDaoLocal {

	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public SoutenanceDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void add(Soutenance soutenance) {
		entityManager.persist(soutenance);
		System.out.println("ok");
		
	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.find(Soutenance.class, id));
		System.out.println("ok");
		
	}

	@Override
	public Soutenance findSoutenanceById(int id) {
		
		return entityManager.find(Soutenance.class, id);
	}

	@Override
	public List<Soutenance> findall() {
		
		return entityManager.createQuery("select s from Soutenance s").getResultList();
	}

	@Override
	public void update(Soutenance soutenance) {
		entityManager.merge(soutenance);
		System.out.println("ok");
		
	}

}
