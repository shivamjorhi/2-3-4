package com.cg.services;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {

	public Trainee findById(int traineeId);
	public List<Trainee> getAll();
	public void update(Trainee t);
	public void create(Trainee t);
	public void delete(int traineeId);
}
