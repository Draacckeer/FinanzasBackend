package com.example.finanzasbackend.app.resources.user;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResource {
    private String nombres;
    private String username;
    private String password;
}
