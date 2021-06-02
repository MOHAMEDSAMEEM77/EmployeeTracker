package com.EmployeeTrack.Employee.controller;

import com.EmployeeTrack.Employee.model.Employee;
import com.EmployeeTrack.Employee.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/Employee/")
public class RabbitMQController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@PutMapping("/producer/{id}")
	public String producer(@PathVariable("id") int employeeId, @RequestBody Employee employee) throws InterruptedException {
	      rabbitMQSender.send(employee);
		return "Message sent to the RabbitMQ employeetracker Successfully";
	}

}

