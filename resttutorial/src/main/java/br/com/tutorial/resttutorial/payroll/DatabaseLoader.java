package br.com.tutorial.resttutorial.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired //setta as coisa pra funcionar, por isso n precisa do new EmployeeRepository
    public DatabaseLoader(EmployeeRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Isa", "Cmp", "Funny"));
        this.repository.save(new Employee("Dianna", "Melhorque", "Evelynn"));
        this.repository.save(new Employee("Tami", "Gabriel", "Teemo"));

    }
}
