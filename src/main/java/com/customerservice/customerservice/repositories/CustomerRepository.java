package com.customerservice.customerservice.repositories;

import com.customerservice.customerservice.domain.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {
}
