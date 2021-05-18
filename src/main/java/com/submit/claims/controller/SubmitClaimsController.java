package com.submit.claims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.submit.claims.model.SubmitClaims;
import com.submit.claims.repository.SubmitClaimsRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SubmitClaimsController {

	@Autowired
	SubmitClaimsRepository customerRepository;

	@RequestMapping(method=RequestMethod.GET, value="/api/submitclaims")
	public List<SubmitClaims> getAllCustomers() {
		return customerRepository.findAll();
	}

	 @RequestMapping(method=RequestMethod.POST, value="/api/submitclaims")
	public SubmitClaims createCustomer(@RequestBody SubmitClaims customer) {
		return customerRepository.save(customer);
	}
}