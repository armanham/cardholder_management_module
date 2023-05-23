package com.bdg.cardholder_management_module.request;

import com.bdg.cardholder_management_module.entity.CardHolderType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.util.Date;

public record CardHolderRequest(

        @Pattern(
                regexp = "^[A-Z][A-Za-z\\s-]*$",
                message = "First name must start with uppercase"
        )
        String firstName,

        @Pattern(
                regexp = "^[A-Z][A-Za-z\\s-]*$",
                message = "Last name must start with uppercase"
        )
        String lastName,

        @Pattern(
                regexp = "^(19|20)\\d\\d-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2[0-8]|(0[1-9]|1[0-9]|2[0-9])(?=\\d))$",
                message = "Regex: yyyy-mm-dd"
        )
        Date dob,

        @Pattern(
                regexp = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$",
                message = "The phone number must be like these: \n" +
                        "123-456-7890\n" +
                        "(123) 456-7890\n" +
                        "123 456 7890\n" +
                        "123.456.7890\n" +
                        "+91 (123) 456-7890"
        )
        String phone,

        @Email
        String email,

        @Pattern(
                regexp = "^(LEGAL|INDIVIDUAL)$",
                message = "Card holder type: LEGAL or INDIVIDUAL"
        )
        CardHolderType cardHolderType
) {
}