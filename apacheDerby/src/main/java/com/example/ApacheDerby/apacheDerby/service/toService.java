package com.example.ApacheDerby.apacheDerby.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApacheDerby.apacheDerby.Customer.Customer;
import com.example.ApacheDerby.apacheDerby.Repository.Repo;
import com.example.ApacheDerby.apacheDerby.Repository.toRepository;
import com.example.ApacheDerby.apacheDerby.dto.CustomerDto;

@Service
public class toService {
	
	@Autowired
	toRepository torepository;
	
	@Autowired
	Repo repo;
	

	public List<CustomerDto> getAllTo(){
		
		List<Customer> n = new ArrayList<>();
		
		  Iterable<Customer> Customer = torepository.findAll();
		  List<CustomerDto> Customerdto = new ArrayList<>();
		  Customer.forEach(x -> {CustomerDto y = new CustomerDto() ;
		  y.setId(x.getId());
		  y.setName(x.getName());
		  y.setNumber(x.getNumber());
		  y.setAddress(x.getAddress());
		  Customerdto.add(y);
		  } );
		  
		return Customerdto;
	
	}
	public void createTo(CustomerDto c) {
		
		Customer d  = new Customer();
		
		d.setAddress(c.getAddress());
		d.setId(c.getId());
		d.setName(c.getName());
		d.setNumber(c.getNumber());
		
		torepository.save(d);
	}
	
	
	
	
	public CustomerDto getById(Integer id) {
		
		
		Customer c =torepository.findById(id).get();
		CustomerDto k = new CustomerDto();
		k.setAddress(c.getAddress());
		k.setId(c.getId());
		k.setName(c.getName());
		k.setNumber(c.getNumber());
		
		return k;
		
	}
	
	public void upadateTo(Integer id ,CustomerDto c) {
		
        Customer d  = new Customer();
		
		d.setAddress(c.getAddress());
		d.setId(c.getId());
		d.setName(c.getName());
		d.setNumber(c.getNumber());
		
		torepository.save(d);
		
		
		
	}
	
	public void deleteTo(Integer id) {
		
		torepository.deleteById(id);
	}
	
	public String authenticateCustomer (CustomerDto dto) throws Exception{
		
		String toret = null ;
		
		CustomerDto c = repo.getCustomerLoginByLoginName(dto.getId());
		
		
		 if(c.getNumber() == dto.getNumber()) {
			 toret = "sucess" ;
		 }
		 
		 else {
			 toret = null;
			 throw new Exception("Galt he");
		 }
		 
		 return toret ;
		 
		
	}
	
	
}

