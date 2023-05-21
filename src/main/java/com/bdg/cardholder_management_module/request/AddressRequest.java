package com.bdg.cardholder_management_module.request;

import jakarta.validation.constraints.Pattern;

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
) {
}