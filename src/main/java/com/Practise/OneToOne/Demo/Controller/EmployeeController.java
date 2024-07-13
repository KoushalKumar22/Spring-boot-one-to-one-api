package com.Practise.OneToOne.Demo.Controller;

import com.Practise.OneToOne.Demo.Entity.Employee;
import com.Practise.OneToOne.Demo.Repository.AddressRepository;
import com.Practise.OneToOne.Demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository erepo;

    @Autowired
    AddressRepository arepo;

    @GetMapping("/test")
    public String test(){
        return  "This Is A Test Run";
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){

        if (employee.getAddress() != null){
            employee.getAddress().setEmployee(employee);
        }
        Employee saveuser=erepo.save(employee);
        return ResponseEntity.ok(saveuser);
    }

    @GetMapping("/all")
    public List<Employee> findAll(){
        return erepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Employee> findById(@PathVariable int id){
        return  erepo.findById(id);
    }

    @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable int id){
        erepo.deleteById(id);
        return "Deleted";
    }


}
