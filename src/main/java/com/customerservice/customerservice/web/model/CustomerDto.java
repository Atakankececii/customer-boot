package com.customerservice.customerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String surname;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private CustomerTypeEnum customerType;

}
