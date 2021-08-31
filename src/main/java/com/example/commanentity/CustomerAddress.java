package com.example.commanentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerAddress {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_customer_id")
    private Customer customer;

    private String address1;
    private String address2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_country_id")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_state_id")
    private State state;

    private String pincode;

    public CustomerAddress(){
        this.id = UUID.randomUUID().toString();
    }
}
