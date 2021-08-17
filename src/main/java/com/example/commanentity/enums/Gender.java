package com.example.commanentity.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Gender {
    MALE(0),
    FEMALE(1);

    private int gender;

    Gender(int gender){this.gender = gender;}
}
