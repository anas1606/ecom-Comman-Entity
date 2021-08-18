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
    private String id;

    private String first_name;
    private String last_name;
    private String company_name;
    private String emailid;
    private String password;
    private String phoneno;
    private String profile_url;
    private String session_token;

    public Vendor() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.DEACTIVATE.getStatus());
    }
}
