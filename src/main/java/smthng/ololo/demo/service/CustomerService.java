package smthng.ololo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import smthng.ololo.demo.dao.CustomerDao;
import smthng.ololo.demo.dto.Customer;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public List<Customer> loadAllCusomers(){
        long start = System.currentTimeMillis();
        List<Customer> customers = customerDao.getCustomers();
        long end = System.currentTimeMillis();
        System.out.println("Execution time : " + (end-start));
        return customers;
    }

    public Flux<Customer> loadAllCusomersReact(){
        long start = System.currentTimeMillis();
        Flux<Customer> customers = customerDao.getCustomersReact();
        long end = System.currentTimeMillis();
        System.out.println("Execution time : " + (end-start));
        return customers;
    }

}
