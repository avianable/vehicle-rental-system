package com.abhinav.crs.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.crs.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
