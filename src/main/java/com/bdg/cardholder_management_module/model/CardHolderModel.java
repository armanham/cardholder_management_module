package com.bdg.cardholder_management_module.model;

import com.bdg.cardholder_management_module.entity.CardHolderType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public final class CardHolderModel {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dob;
    private String phone;
    private String email;
    private CardHolderType cardHolderType;

    public CardHolderModel(
            Long id,
            String firstName,
            String lastName,
            Date dob,
            String phone,
            String email,
            CardHolderType cardHolderType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.cardHolderType = cardHolderType;
    }
}