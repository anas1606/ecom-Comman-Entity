package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Customer extends AbstractDomain {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String emailid;
    private String email_verification_otp;
    private boolean emailverified;
    private String password;
    private String phoneno;
    private int gender;
    private String profile_url;
    private String session_token;

    public Customer() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.DEACTIVATE.getStatus());
    }
}
