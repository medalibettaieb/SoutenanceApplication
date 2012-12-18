package tn.esprit.soutenanceApplication.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.esprit.soutenanceApplication.dao.interfaces.NoteDaoLocal;
import tn.esprit.soutenanceApplication.dao.interfaces.NoteDaoRemote;
import tn.esprit.soutenanceApplication.persistence.Note;

/**
 * Session Bean implementation class NoteDao
 */
@Stateless
public class NoteDao implements NoteDaoRemote, NoteDaoLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public NoteDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Note note) {
		entityManager.persist(note);
		System.out.println("ok");

	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.find(Note.class, id));
		System.out.println("ok");

	}

	@Override
	public Note findNoteById(int id) {

		return entityManager.find(Note.class, id);
	}

	@Override
	public List<Note> findall() {

		return entityManager.createQuery("select n from Note n")
				.getResultList();
	}

	@Override
	public void update(Note note) {
		entityManager.merge(note);

	}

}
