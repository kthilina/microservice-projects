package com.kasunth.rentcloud.profileservice.controller;

import com.kasunth.rentcloud.commons.model.Customer;
import com.kasunth.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/profile")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
