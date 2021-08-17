package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ComanyAddress {
    @Id
    private String companyAddressUID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Vedor")
    private Vendor vendorUID;

    private String Address1;
    private String Address2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Country")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "State")
    private State state;

    private int pincode;
}
