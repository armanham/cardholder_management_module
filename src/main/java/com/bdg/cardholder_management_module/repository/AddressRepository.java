package com.bdg.cardholder_management_module.repository;

import com.bdg.cardholder_management_module.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {


}