package com.bdg.cardholder_management_module.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

import java.sql.Date;

@Entity
@Table(name = "passport")
@Check(
        name = "check_giv_date_exp_date",
        constraints = "giv_date < exp_date"
)
@NoArgsConstructor
@Getter
@Setter
public class PassportEntity {

    @Id
    @Column(name = "serial_no", length = 24)
    private String serialNumber;

    @Column(name = "nationality", nullable = false, length = 32)
    private String nationality;

    @Column(name = "giv_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date givenDate;

    @Column(name = "exp_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expireDate;

    @Column(name = "given_by", nullable = false, length = 12)
    private String givenBy;
}