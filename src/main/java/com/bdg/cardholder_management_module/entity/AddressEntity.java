package com.bdg.cardholder_management_module.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(
        name = "address",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "UC_street_city_state",
                        columnNames = {"street", "city", "country"}
                ),
                @UniqueConstraint(
                        name = "UC_postal_code",
                        columnNames = {"postal_code"}
                )
        }
)
@NoArgsConstructor
@Getter
@Setter
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street", nullable = false, length = 64)
    private String street;

    @Column(name = "city", nullable = false, length = 64)
    private String city;

    @Column(name = "country", nullable = false, length = 64)
    private String country;

    @Column(name = "postal_code", nullable = false, length = 10)
    private String postalCode;


    @Column(name = "createdOn")
    private Date createdOn;

    @Column(name = "updatedOn")
    private Date updatedOn;

    @Column(name = "deletedOn")
    private Date deletedOn;

    @Column(name = "isDeleted", nullable = false)
    private Boolean isDeleted;

    @ManyToMany(mappedBy = "addresses")
    private Set<CardHolderEntity> cardHolders = new LinkedHashSet<>();
}