package com.DermApp.Backend.diagnostic.domain.model.entity;

import com.DermApp.Backend.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name = "list_of_patients")
public class ListOfPatient extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "list_of_patients_patients",
            joinColumns = @JoinColumn(name = "list_of_patients_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private Set<Patient> patients = new HashSet<>();
}
