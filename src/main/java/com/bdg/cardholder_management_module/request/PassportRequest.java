package com.bdg.cardholder_management_module.request;

import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

public record PassportRequest(

        @Pattern(
                regexp = "[A-Z]{2}\\d{7}",
                message = "Serial number must have 2 uppercase letters followed by 7 digits"
        )
        String serialNumber,

        @Length(
                min = 2,
                max = 32,
                message = "Nationality length must be in range[2; 32]"
        )
        String nationality,

        @Pattern(
                regexp = "^(19|20)\\d\\d-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2[0-8]|(0[1-9]|1[0-9]|2[0-9])(?=\\d))$",
                message = "Regex: dd-mm-yyyy"
        )
        Date given,

        @Pattern(
                regexp = "^(19|20)\\d\\d-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2[0-8]|(0[1-9]|1[0-9]|2[0-9])(?=\\d))$",
                message = "Regex: dd-mm-yyyy"
        )
        Date expireDate,

        @Length(
                min = 3,
                max = 6,
                message = "GivenBy length must be in range[3; 6]"
        )
        String givenBy
) {
}