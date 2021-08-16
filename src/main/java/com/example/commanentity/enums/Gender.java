package com.example.commanentity.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private String gender;

    private Gender(String gender){this.gender = gender;}
}
