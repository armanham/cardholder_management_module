package com.bdg.cardholder_management_module.controller;

import com.bdg.cardholder_management_module.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bdg.cardholder_management_module.service.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(value = "/new")
    public boolean add(@RequestBody AddressModel model){

        addressService.save(model);
        return true;
    }
}