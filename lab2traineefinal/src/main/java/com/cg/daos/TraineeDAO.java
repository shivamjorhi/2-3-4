package com.cg.daos;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeDAO {
	
	public Trainee findById(int traineeId);
	public List<Trainee> getAll();
	public void update(int id, Trainee t);
	public void save(Trainee t);
	public void delete(Trainee t);

}
