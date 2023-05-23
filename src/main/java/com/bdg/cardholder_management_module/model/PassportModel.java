package com.bdg.cardholder_management_module.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public final class PassportModel {

    private String serialNumber;
    private String nationality;
    private String givenDate;
    private String expireDate;
    private String givenBy;

    public PassportModel() {
    }

    public PassportModel(
            String serialNumber,
            String nationality,
            Date given,
            Date expireDate,
            String givenBy) {
        this.serialNumber = serialNumber;
        this.nationality = nationality;
        this.givenDate = givenDate;
        this.expireDate = expireDate;
        this.givenBy = givenBy;
    }
}