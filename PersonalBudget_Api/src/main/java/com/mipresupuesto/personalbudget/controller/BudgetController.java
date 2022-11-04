package com.mipresupuesto.personalbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.controller.response.Response;
import com.mipresupuesto.personalbudget.controller.response.dto.Message;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
	
	@Autowired
	private CreateBudgetPort createBudgetPort;
	
	
	@PostMapping
	public ResponseEntity<Response<BudgetDTO>> create(@RequestBody BudgetDTO budget) {
		ResponseEntity<Response<BudgetDTO>> responseEntity;
		Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		
		try {

			createBudgetPort.execute(budget);
			response.addMessage(Message.createError);
			
			
			
		}catch (final Exception exepcion) {
			statusCode=HttpStatus.BAD_REQUEST;
			reponse.addMessage(Message.createErrorMessage);
		}
		
		
		
	}
	
	
	@GetMapping
	public String saludar() {
		return "Hola Mundo";
	}
	
	

}
