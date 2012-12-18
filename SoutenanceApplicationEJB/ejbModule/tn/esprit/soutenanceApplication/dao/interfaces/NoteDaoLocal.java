package tn.esprit.soutenanceApplication.dao.interfaces;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.soutenanceApplication.persistence.Note;

@Local
public interface NoteDaoLocal {
	public void add(Note note);
	public void delete(int id);
	public void update(Note note);
	public Note findNoteById(int id);
	public List<Note> findall();

}
