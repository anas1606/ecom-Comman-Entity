package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Admin {
    @Id
    private String adminuid;
    private String username;
    private String emailid;
    private String password;
    private String sessiontoken;

    public Admin() {
        this.adminuid = UUID.randomUUID().toString();
    }
}
