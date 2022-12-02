package com.springruntest.springruntest.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.springruntest.springruntest.model.IMCInput;

@Service
public class IMCService {
	
	public BigDecimal imcGeneration(IMCInput iMCInput) {
		BigDecimal imc = iMCInput.getWeight().divide(iMCInput.getHeight().multiply(iMCInput.getHeight()));
		return imc;
	}
	
}
