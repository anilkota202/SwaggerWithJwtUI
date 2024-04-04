package com.activation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activation.model.Empolyee;
import com.activation.model.UserInfo;
import com.activation.repository.EmpRepository;

@RestController
@RequestMapping("/empployee")
@PreAuthorize("hasAuthority('ROLE_USER')")
public class EmpController {
	
	@Autowired
	public EmpRepository emprepository;
	
	
	@GetMapping("/getallempolyess")
	public List<Empolyee> getAllEmpoyee(){
		
		return emprepository.findAll();
	}
	
	@PostMapping("/createemployee")
    public Empolyee addNewUser(@RequestBody Empolyee empoyeeInfo) {
        return emprepository.save(empoyeeInfo);
    }
	

}
