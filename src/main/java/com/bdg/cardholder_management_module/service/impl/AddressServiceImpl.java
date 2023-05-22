package com.bdg.cardholder_management_module.service.impl;

import com.bdg.cardholder_management_module.entity.AddressEntity;
import com.bdg.cardholder_management_module.model.AddressModel;
import com.bdg.cardholder_management_module.repository.CardHolderRepository;
import com.bdg.cardholder_management_module.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bdg.cardholder_management_module.repository.AddressRepository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final CardHolderRepository cardHolderRepository;
    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, CardHolderRepository cardHolderRepository) {
        this.addressRepository = addressRepository;
        this.cardHolderRepository = cardHolderRepository;
    }

    @Override
    public boolean save(AddressModel addressModel) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet(addressModel.getStreet());
        addressEntity.setCity(addressModel.getCity());
        addressEntity.setCountry(addressModel.getCountry());
        addressEntity.setPostalCode(addressModel.getPostalCode());
        addressEntity.setCreatedOn(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
        addressEntity.setIsDeleted(false);
        addressRepository.save(addressEntity);
        return true;
    }
    //todo
    @Override
    public boolean update(AddressModel addressModel, long id) {
        if (id<1 ){
            throw new  IllegalArgumentException();
        }

        Optional<AddressEntity> addressEntity1 = addressRepository.findById(id);

        if (addressEntity1.isEmpty()){
            throw new IllegalArgumentException();
        }

        AddressEntity addressEntity = addressEntity1.get();
        addressEntity.setStreet(addressModel.getStreet());
        addressEntity.setCity(addressModel.getCity());
        addressEntity.setCountry(addressModel.getCountry());
        addressEntity.setPostalCode(addressModel.getPostalCode());
        addressEntity.setUpdatedOn(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));

        return true;
    }

    @Override
    public boolean delete(long id){
        if (id <= 0) {
            throw new IllegalArgumentException();
        }
        if (cardHolderRepository.existsByAddress_Id(id)){
            return false;
        }
        if (addressRepository.existsById(id)){
            Optional<AddressEntity> addressEntity1 = addressRepository.findById(id);
            AddressEntity addressEntity = addressEntity1.get();
            addressEntity.setDeletedOn(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
            addressEntity.setIsDeleted(true);
            return true;
        }
        return false;
    }

}