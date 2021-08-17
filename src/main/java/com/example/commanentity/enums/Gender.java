package com.example.commanentity.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Gender {
    MALE(1),
    FEMALE(2),
    OTHER(3);

    private int gender;

    Gender(int gender){this.gender = gender;}
}
