package com.eazybytes.bus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bus {
    @Id
    private String busId;
    private String busName;
    private String capacity;
}

