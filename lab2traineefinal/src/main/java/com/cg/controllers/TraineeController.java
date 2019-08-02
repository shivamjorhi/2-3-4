package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.services.TraineeService;


@Controller
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired private TraineeService service;
	
	//on GET request just show FORM
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@GetMapping("/add")
	public String newSave(Model model) {
		model.addAttribute("trainee", new Trainee());
		return "add-trainee";
	}
		@PostMapping("/add")
	public String newSave(Model model, @ModelAttribute("add") Trainee trainee) {
		String message=null;
		try {
			service.create(trainee);
			message= "Trainee "+trainee.getTraineeId()+" added successfully";
			model.addAttribute("trainee	",new Trainee());//Empty the form fields on success
		}
		catch(Exception ex)
		{
			message="No Records Found";
		}
		model.addAttribute("msg",message);
		return "add-trainee";
	}

   //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@GetMapping("/view-all")
	public String findAll(Model model) {
		String message=null;
		try {
			List<Trainee> trainee=service.getAll();
			message=trainee.size()+" records found!";
			model.addAttribute("trainee", trainee);
		}
		catch(Exception e) {
			message="No records found";
		}
		model.addAttribute("msg",message);
		return "retrieveall";

	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@GetMapping("/view")
    public String viewOne(Model model) {
        return "retrieve";
    }
	
	
	@PostMapping("/view")
    public String viewDetails(Model model, @RequestParam int traineeId) {
		String message=null;
        try {
        Trainee trainee = service.findById(traineeId);
        message="Record Found";
        model.addAttribute("trainee", trainee);
        }catch(Exception ex) {
            message="No record found";
        }
        model.addAttribute("msg",message);
        return "retrieve";
    }
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@GetMapping("/delete")
    public String deleteFind() {
        return "delete";
    }
	
	//on POST request display details and delete button
    @PostMapping("/delete")
    public String deleteForm(Model model,@RequestParam int traineeId) {
        try {
            Trainee trainee = service.findById(traineeId);
            model.addAttribute("trainee", trainee);
        }catch(Exception ex) {
            System.out.println("Error "+ex.getMessage());
            model.addAttribute("msg","No record found!");
        }
        return "delete";
    }
    
  //on POST request delete by id
    @PostMapping("/delete-by-id")
    public String deleteById(Model model,@RequestParam int id) {
        try {
            service.delete(id);
            model.addAttribute("msg","Trainee deleted successfuly!");
        }catch(Exception ex) {
            System.out.println("Error "+ex.getMessage());
            model.addAttribute("msg","No record found!");
        }
        return "delete";
    }
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  //on GET request just show FORM
    @GetMapping("/edit")
    public String editView() {
        return "modify";
    }
    
    //on POST request display details
    @PostMapping("/edit")
    public String editDetails(Model model,@RequestParam int id) {
    	
        try {
            Trainee trainee = service.findById(id);
            
            model.addAttribute("trainee", trainee);
        }catch(Exception ex) {
            System.out.println("Error "+ex.getMessage());
            model.addAttribute("msg","No record found!");
        }
        return "modify";
    }
    
    @PostMapping("/edit-save")
    public String editSave(Model model, @ModelAttribute Trainee t) {
    	String message=null;
        try {
            service.update(t);
            message="Modified";
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            model.addAttribute("msg",ex.getMessage());
        }
        model.addAttribute("msg",message);
        return "modify";
    }
    
}
