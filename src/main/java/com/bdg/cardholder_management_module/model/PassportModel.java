package com.bdg.cardholder_management_module.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public final class PassportModel {

    private String serialNumber;
    private String nationality;
    private Date given;
    private Date expireDate;
    private String givenBy;

    public PassportModel(
            String serialNumber,
            String nationality,
            Date given,
            Date expireDate,
            String givenBy) {
        this.serialNumber = serialNumber;
        this.nationality = nationality;
        this.given = given;
        this.expireDate = expireDate;
        this.givenBy = givenBy;
    }
}