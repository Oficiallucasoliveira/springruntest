package com.springruntest.springruntest.api;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springruntest.springruntest.model.IMCInput;
import com.springruntest.springruntest.service.IMCService;

@RestController
@RequestMapping("/imc")
public class WebService {
	
	@Autowired
	private IMCService iMCService; 
	
	@PostMapping
	public ResponseEntity<BigDecimal> getImc(@RequestBody IMCInput iMCInput){
		return new ResponseEntity<BigDecimal>(iMCService.imcGeneration(iMCInput),HttpStatus.OK);
	}
}
