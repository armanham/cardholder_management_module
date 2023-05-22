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
    private String postalCode;
    private Date createdOn;
    private Date updatedOn;
    private Date deletedOn;
    private Boolean isDeleted;

    public AddressModel(Long id, String street, String city, String country, String postalCode, Date createdOn, Date updatedOn, Date deletedOn, Boolean isDeleted) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.deletedOn = deletedOn;
        this.isDeleted = isDeleted;
    }
}