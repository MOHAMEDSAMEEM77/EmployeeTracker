package com.EmployeeTrack.Employee.service;

import com.EmployeeTrack.Employee.model.Employee;
import com.EmployeeTrack.Employee.repo.EmployerRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RabbitMQConsumer {
	@Autowired
	private EmployerRepository employeerepository;
	@RabbitListener(queues = "${employeetracker.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		employeerepository.save(employee);
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}