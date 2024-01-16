package com.confluence.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AtlassianUsers {
    USER("testerqajava@gmail.com", "SavePassword!");

    private final String userName;
    private final String password;

}

