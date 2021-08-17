package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class ComanyAddress {
    @Id
    private String companyAddressuid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Vedor")
    private Vendor vendoruid;

    private String address1;
    private String address2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Country")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "State")
    private State state;

    private int pincode;

    public ComanyAddress (){
        this.companyAddressuid = UUID.randomUUID().toString();
    }
}
