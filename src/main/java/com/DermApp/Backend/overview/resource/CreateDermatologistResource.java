package com.DermApp.Backend.overview.resource;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class CreateDermatologistResource {

    @NotNull
    @NotBlank
    @Size(max = 60)
    private String name;

    private int age;

    private String email;

    @Size(max = 60)
    private String password;

    @Size(max = 240)
    private String address;

    @Size(max = 400)
    private String description;

    private String urlToImage;
}
