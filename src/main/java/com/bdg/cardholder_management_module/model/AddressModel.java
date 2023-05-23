package com.bdg.cardholder_management_module.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public final class AddressModel {

    private Long id;
    private String street;
    private String city;
    private String country;

    public AddressModel() {
    }

    public AddressModel(
            Long id,
            String street,
            String city,
            String country) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
    }
    public AddressModel(AddressRequest addressRequest){
        this.street = addressRequest.street();
        this.city = addressRequest.city();
        this.country = addressRequest.country();
    }

    public AddressModel(AddressEntity addressEntity){
        this.street = addressEntity.getStreet();
        this.city = addressEntity.getCity();
        this.country = addressEntity.getCountry();
    }

    public AddressModel getFromRequest(AddressRequest addressRequest){
        this.street = addressRequest.street();
        this.city = addressRequest.city();
        this.country = addressRequest.country();
        return this;
    }

    public AddressModel getFromEntity(AddressEntity addressEntity){
        this.street = addressEntity.getStreet();
        this.city = addressEntity.getCity();
        this.country = addressEntity.getCountry();
        return this;
    }
}