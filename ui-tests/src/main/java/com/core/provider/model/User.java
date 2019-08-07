package com.core.provider.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@SuppressWarnings("JavadocType")
public class User {

    private String email;
    private String password;
    private String role;
}
