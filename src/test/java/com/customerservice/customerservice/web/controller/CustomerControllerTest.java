package com.customerservice.customerservice.web.controller;

import com.customerservice.customerservice.web.model.CustomerDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.print.attribute.standard.Media;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CustomerController.class)
class CustomerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getCustomerById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/customer/"+ UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewCustomer() throws Exception {
        CustomerDto customerDto = CustomerDto.builder().build();
        String customerDtoJson = objectMapper.writeValueAsString(customerDto);

        mockMvc.perform(post("/api/v1/customer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(customerDtoJson))
                .andExpect(status().isCreated());

    }

    @Test
    void updateCustomerById() throws Exception {
        CustomerDto customerDto = CustomerDto.builder().build();
        String customerDtoJson = objectMapper.writeValueAsString(customerDto);

        mockMvc.perform(post("/api/v1/customer" +UUID.randomUUID().toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(customerDtoJson))
                .andExpect(status().isNoContent());
    }

    @Test
    void deleteCustomerById() {
    }
}