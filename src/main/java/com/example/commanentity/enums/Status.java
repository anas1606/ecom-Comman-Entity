package com.example.commanentity.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Status {
    ACTIVE(1),
    DEACTIVATE(0);

    private final int status;

    Status(int status) {
        this.status = status;
    }
}
