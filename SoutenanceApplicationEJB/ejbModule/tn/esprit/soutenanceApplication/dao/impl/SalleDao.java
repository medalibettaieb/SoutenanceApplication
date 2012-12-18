package tn.esprit.soutenanceApplication.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.soutenanceApplication.dao.interfaces.SalleLocal;
import tn.esprit.soutenanceApplication.dao.interfaces.SalleRemote;
import tn.esprit.soutenanceApplication.persistence.Salle;

/**
 * Session Bean implementation class Salle
 */
@Stateless
public class SalleDao implements SalleRemote, SalleLocal {

	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public SalleDao() {
        // TODO Auto-generated constructor stub
    }

	

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.find(SalleDao.class, id));
		System.out.println("ok");
		
	}



	@Override
	public void add(Salle salle) {
		entityManager.persist(salle);
		System.out.println("ok");
	}



	@Override
	public Salle findSalleById(int id) {
		
		return entityManager.find(Salle.class, id);
	}



	@Override
	public List<Salle> findall() {
		
		return entityManager.createQuery("select s from Salle s").getResultList();
	}



	@Override
	public void update(Salle salle) {
		entityManager.merge(salle);
		System.out.println("ok");
		
	}

}
