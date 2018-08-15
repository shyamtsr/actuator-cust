package com.ssreddy.actuator.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import com.ssreddy.actuator.model.CustActuatorDTO;

@Component
@Endpoint(id="ssreddy",enableByDefault=true)
public class CustActuatorConfig {

	@ReadOperation
	public CustActuatorDTO custActuator() {
		return new CustActuatorDTO(123, "SSReddy", "SSreddy-Active");
	}
	
}
