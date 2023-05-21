package com.bdg.cardholder_management_module.service.impl;

import com.bdg.cardholder_management_module.entity.AddressEntity;
import com.bdg.cardholder_management_module.model.AddressModel;
import com.bdg.cardholder_management_module.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bdg.cardholder_management_module.repository.AddressRepository;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public boolean save(AddressModel addressModel) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet(addressModel.getStreet());
        addressEntity.setCity(addressModel.getCity());
        addressEntity.setCountry(addressModel.getCountry());
        addressEntity.setPostalCode(addressModel.getPostalCode());
        addressRepository.save(addressEntity);
        return true;
    }
}