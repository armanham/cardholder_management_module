package com.bdg.cardholder_management_module.controller;

import com.bdg.cardholder_management_module.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PutMapping(value = "/update/{id}")
    public boolean update(@RequestBody AddressModel model, @PathVariable("id") Long id){
        return addressService.update(model, id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return  addressService.delete(id);
    }
}