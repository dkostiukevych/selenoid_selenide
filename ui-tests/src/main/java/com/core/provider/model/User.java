package com.core.provider.model;

import io.github.sskorol.data.Source;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Source(path = "deps.yml")
@NoArgsConstructor
@SuppressWarnings("JavadocType")
public class User {

    private String email;
    private String password;
    private String role;
}
