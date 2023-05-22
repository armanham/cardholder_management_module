package com.bdg.cardholder_management_module.repository;

import com.bdg.cardholder_management_module.entity.CardHolderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardHolderRepository extends JpaRepository<CardHolderEntity,Long > {

    boolean existsByAddress_Id(long id);

}
