package com.example.commanentity.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Status {
    ACTIVE("Active"),
    DEACTIVATE("Deactivate");

    private String status;

    Status(String status) {
        this.status = status;
    }
}
