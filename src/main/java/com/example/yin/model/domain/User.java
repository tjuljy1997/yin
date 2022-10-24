package com.example.yin.model.domain;

import lombok.Data;

@Data
public class User extends BasePOJO{
    private String userName;
    private String password;
}
