package com.kasunth.rentcloud.profileservice.repository;

import com.kasunth.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
