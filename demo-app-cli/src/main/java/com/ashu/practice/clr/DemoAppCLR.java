package com.ashu.practice.clr;

import com.ashu.practice.model.Employee;
import com.ashu.practice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoAppCLR implements CommandLineRunner {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public void run(String... args) throws Exception {
        log.debug("Starting CLR");
        Employee emp = new Employee();
        emp.setName("test-user");
        empRepo.saveAndFlush(emp);
        log.debug("printing employees list");
        empRepo.findAll().forEach(e -> log.debug(e.toString()));
        log.debug("Deleting employees list");
        empRepo.deleteAll();
        log.debug("Employees list size after delete={}", empRepo.findAll().size());
        log.debug("Completed CLR");
    }
}
