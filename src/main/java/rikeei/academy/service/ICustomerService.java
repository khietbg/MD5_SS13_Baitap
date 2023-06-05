package rikeei.academy.service;

import rikeei.academy.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
