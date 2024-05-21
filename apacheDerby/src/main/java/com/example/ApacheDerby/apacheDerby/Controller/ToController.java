package com.example.ApacheDerby.apacheDerby.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.dto.CustomerDto;
import com.example.ApacheDerby.apacheDerby.service.toService;


@CrossOrigin( origins = "http://localhost:3000")
@RestController
public class ToController {
	
	@Autowired
	toService toservice ;
	
	
	@RequestMapping("/customer")
	public List<CustomerDto> getAllTo(){
		return toservice.getAllTo();	
	}
	
	
	
	@RequestMapping("/customer/{id}")
	public CustomerDto getTo(@PathVariable Integer id) {
		return toservice.getById(id);
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST ,value="/customer")
	public void createTo(@RequestBody CustomerDto c) {
		toservice.createTo(c);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT ,value="/customer/{id}")
	public void updateTo(@PathVariable Integer id ,@RequestBody CustomerDto c) {
		
		toservice.upadateTo(id, c);
	}
	
	@RequestMapping(method=RequestMethod.DELETE ,value="/customer/{id}")
	public void deleteTo(@PathVariable Integer id ) {
		toservice.deleteTo(id);
	}
	
	
	
}




