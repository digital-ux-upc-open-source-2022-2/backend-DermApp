package com.DermApp.Backend.diagnostic.domain.model.entity;

import com.DermApp.Backend.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")
public class Patient extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    @Size(max = 60)
    private String name;

    private int age;


    private String gender;


    @Size(max = 240)
    private String address;

    @Size(max = 400)
    private String description;

    private String message;

    private String urlToImage;

    private String status;

    private String diagnostic;

    private String treatment;

    @OneToOne(mappedBy = "patient")
    private Chat chat;



}
