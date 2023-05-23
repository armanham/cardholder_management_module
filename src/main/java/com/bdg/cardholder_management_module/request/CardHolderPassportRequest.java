package com.bdg.cardholder_management_module.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
public class CardHolderPassportRequest{


                @Valid
        CardHolderRequest cardHolderRequest;

                @Valid
        PassportRequest passportRequest;
}