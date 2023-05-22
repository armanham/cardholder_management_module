package com.bdg.cardholder_management_module.request;

import jakarta.validation.constraints.Pattern;

import java.util.Date;

public record AddressRequest(

        @Pattern(regexp = "^[A-Za-z0-9\\s,.-]*$")
        String street,

        @Pattern(regexp = "^[A-Za-z\\s.-]*$")
        String city,

        @Pattern(regexp = "^[A-Za-z\\s',.-]*$")
        String country,

        @Pattern(
                regexp = "^\\d{5}$",
                message = "Postal code should be 5 digits"
        )
        String postalCode

//        @Pattern(
//                regexp = "^(19|20)\\d\\d-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2[0-8]|(0[1-9]|1[0-9]|2[0-9])(?=\\d))$",
//                message = "Regex: dd-mm-yyyy"
//        )
//        Date createdOn,
//
//        @Pattern(
//                regexp = "^(19|20)\\d\\d-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2[0-8]|(0[1-9]|1[0-9]|2[0-9])(?=\\d))$",
//                message = "Regex: dd-mm-yyyy"
//        )
//        Date updatedOn



) {
}