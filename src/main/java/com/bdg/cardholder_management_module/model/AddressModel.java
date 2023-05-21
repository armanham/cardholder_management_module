package com.bdg.cardholder_management_module.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class AddressModel {

    private Long id;
    private String street;
    private String city;
    private String country;
    private String postalCode;

    public AddressModel(
            Long id,
            String street,
            String city,
            String country,
            String postalCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }
}