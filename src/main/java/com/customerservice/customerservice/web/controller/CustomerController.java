package com.customerservice.customerservice.web.controller;


import com.customerservice.customerservice.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {


    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
        //todo impl
        return new ResponseEntity<>(CustomerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveNewCustomer(@RequestBody CustomerDto customerDto){
        //todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerDto> updateCustomerById(@PathVariable("customerId") UUID customerId ,@RequestBody CustomerDto customerDto){
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public void deleteCustomerById(@PathVariable("customerId") UUID customerId){

    }









}
