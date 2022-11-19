package com.DermApp.Backend.diagnostic.resource;

import com.DermApp.Backend.diagnostic.domain.model.entity.Chat;
import lombok.*;


@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class DermatologistResource {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String specialty;
    private String address;
    private String description;
    private String message;
    private String urlToImage;
    private Chat chat;
}
