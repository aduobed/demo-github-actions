package com.mallon.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ExampleRESTEndpoint {
	
	// Build a repo and load some fake data into it.
	private List<TransferObject> repository = new ArrayList<>();


	@CrossOrigin
	@RequestMapping(method = {RequestMethod.POST}, path="/example") 
	public @ResponseBody List<TransferObject> examplePOSTEndpoint(@RequestBody TransferObject sentIn) {
		
		System.out.println("POST /example received with object: " + sentIn);
		this.repository.add(sentIn);
		
		return repository;
	}
	
	@CrossOrigin
	@RequestMapping(method = {RequestMethod.GET}, path="/example") 
	public @ResponseBody List<TransferObject> exampleGETEndpoint() {
		
		System.out.println("GET /example requested, sending list: " + this.repository);
		
		return this.repository;
	}

}
