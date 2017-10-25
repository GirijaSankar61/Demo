/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sankar.SpringData;

import java.util.LinkedHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author girija
 */
@Controller
public class EmployeeController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private DomainRepository repository;
    @Autowired
    private CustomerRepository crepository;

    @RequestMapping("/")
    @ResponseBody
    public String helloHandler() {
        Domain d = new Domain();
        d.setId(1114);
        d.setDisplayAds(true);
        d.setDomain("sdtw");
        Domain b = repository.save(d);
        saveTaskHistory();

//        Customer c = new Customer("Jack", "Bauer");
//        c.setFirstName("Jack");
//        c.setFirstName("Jack");
//        crepository.save(c);
//        saveTaskHistory(d);
//        Customer c = new Customer("Jack", "Bauer");
//        Customer c2 = new Customer("Chloe", "O'Brian");
//        Customer c3 = new Customer("Kim", "Bauer");
//        Customer c4 = new Customer("David", "Palmer");
//        Customer c5 = new Customer("Michelle", "Dessler");
//        repository.save(c2);
//        repository.save(c3);
//        repository.save(c4);
//        repository.save(d);
//        return "<h1>Hello World!</h1>";
        return "<h1>Hello World!</h1>" + b.toString();
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String helloHandlerfind() {
        return repository.findAll().toString();
    }

    public void saveTaskHistory() {
        if (!mongoTemplate.collectionExists("hm")) {
            mongoTemplate.createCollection("hm");
        }
        Customer c = new Customer(1l,"Jack", "Bauer");
        Customer c2 = new Customer(11l,"Chloe", "O'Brian");
        Customer c3 = new Customer(12l,"Kim", "Bauer");
        Customer c4 = new Customer(123l,"David", "Palmer");
        Customer c5 = new Customer(1233l,"David", "Palmer");
        LinkedHashMap<Integer, Customer> hm = new LinkedHashMap<>();
        hm.put(100, c);
        hm.put(101, c2);
        hm.put(102, c3);
        hm.put(103, c4);
        hm.put(104, c5);
        crepository.save(c);
        crepository.save(c2);
        crepository.save(c3);
        crepository.save(c4);
        crepository.save(c5);
//        mongoTemplate.insert(hm, "hm");
    }
}
