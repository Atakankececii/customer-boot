package com.customerservice.customerservice.bootstrap;

import com.customerservice.customerservice.domain.Customer;
import com.customerservice.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public CustomerLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCustomerObjects();
    }

    private void loadCustomerObjects() {
        if(customerRepository.count() == 0){
            customerRepository.save(Customer.builder()
                    .name("Deneme")
                    .address("Deneme")
                    .email("deneme@gmail.com")
                    .surname("Deneme")
                    .build());

            customerRepository.save(Customer.builder()
                    .name("Deneme2")
                    .address("Deneme2")
                    .email("deneme2@gmail.com")
                    .surname("Deneme2")
                    .build());
        }

        System.out.println("Loaded Customer objects" + customerRepository.count());
    }
}
