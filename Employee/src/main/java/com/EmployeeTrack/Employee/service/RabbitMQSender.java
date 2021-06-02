package com.EmployeeTrack.Employee.service;

import com.EmployeeTrack.Employee.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${employeetracker.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${employeetracker.rabbitmq.routingkey}")
	private String routingkey;

	public void send(Employee company) throws InterruptedException {

			amqpTemplate.convertAndSend(exchange, routingkey, company);


			System.out.println("Send msg = " + company);
		 
	    
	}
}