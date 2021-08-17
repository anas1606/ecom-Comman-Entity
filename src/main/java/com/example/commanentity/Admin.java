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
    private String id;
    private String username;
    private String emailid;
    private String password;
    private String session_token;

    public Admin() {
        this.id = UUID.randomUUID().toString();
    }
}
