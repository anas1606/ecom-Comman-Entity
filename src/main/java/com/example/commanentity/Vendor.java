package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Vendor extends AbstractDomain {
    @Id
    private String vendorUID;
    private String firstName;
    private String lastName;
    private String companyName;
    private String emailId;
    private String password;
    private String phoneNo;
    private String companyAddress;
    private String country;
    private String state;

    public Vendor() {
        this.vendorUID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
