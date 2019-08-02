package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.daos.TraineeDAO;
import com.cg.entities.Trainee;
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	private TraineeDAO dao;
	
	 @Transactional(readOnly=true)
	public Trainee findById(int traineeId) {
		return dao.findById(traineeId);
	}

	 @Transactional(readOnly=true)
	public List<Trainee> getAll() {
		
		return dao.getAll();
	}

	public void update(Trainee t) {
		Trainee temp = findById(t.getTraineeId());
        dao.update(t.getTraineeId(), t);
		
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void create(Trainee t) {
		dao.save(t);
		
	}

	 
	public void delete(int traineeId) {
		Trainee t=findById(traineeId);
		dao.delete(t);
	}

}
