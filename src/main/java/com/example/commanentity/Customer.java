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
    private String customerUID;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String phoneNo;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String Hobby;
    private String profileURL;

    public Customer(){
        this.customerUID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
