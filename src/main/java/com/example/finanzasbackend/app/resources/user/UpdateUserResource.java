package com.example.finanzasbackend.app.resources.user;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserResource {
    private String nombres;
    private String username;
    private String password;
}
