package com.cg.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeDAOImpl implements TraineeDAO {

	@PersistenceContext
	private EntityManager em;

	private List<Trainee> trainee = new ArrayList<Trainee>();

	public Trainee findById(int traineeId) {
		return em.find(Trainee.class, traineeId);
	}

	public List<Trainee> getAll() {
		Query q = em.createQuery("from Trainee t"); // That's \"JPQL\" not SQL !!!
		return q.getResultList();
	}

	public void update(int id, Trainee t) {
		Trainee temp = findById(id);
        temp.setTraineeName(t.getTraineeName());
        temp.setTraineeDomain(t.getTraineeDomain());
        temp.setTraineeLocation(t.getTraineeLocation());
	}

	public void save(Trainee t) {
		em.persist(t);
		em.flush();

	}

	public void delete(Trainee t) {
		trainee.remove(t);
	}

}
