package com.DermApp.Backend.diagnostic.resource;

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

    @Max(70)
    @Min(18)
    private int age;

    private String gender;

    private String specialty;

    @Size(max = 240)
    private String address;


    private String message;

    private String urlToImage;

    @Size(max = 400)
    private String description;
}
