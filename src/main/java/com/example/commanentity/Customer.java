package com.example.commanentity;

import com.example.commanentity.enums.Gender;
import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Customer extends AbstractDomain{
    @Id
    private String customeruid;
    private String firstname;
    private String lastname;
    private String emailid;
    private int emailverificationotp;
    private boolean emailverified;
    private String password;
    private String phoneNo;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String Hobby;
    private String profileurl;

    public Customer(){
        this.customeruid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
