package com.DermApp.Backend.diagnostic.domain.model.entity;

import com.DermApp.Backend.shared.domain.model.AuditModel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public class Message extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 400)
    private String body;


}
