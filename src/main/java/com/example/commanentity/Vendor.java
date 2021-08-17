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
    private String vendoruid;
    private String firstname;
    private String lastname;
    private String companyname;
    private String emailid;
    private String password;
    private String phoneno;

    public Vendor() {
        this.vendoruid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
