package com.customer.payload;

import lombok.Data;

@Data
public class CustomerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phone;

}
