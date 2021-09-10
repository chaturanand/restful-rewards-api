package com.example.service.springbootrewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.service.springbootrewards.model.Customer;

/**
 * 
 * @author chaturanand yadav
 * @since 2021-10-10
 * This is a repository of {@link CustomerRepository}
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
