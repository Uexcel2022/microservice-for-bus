package com.eazybytes.bus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Bus extends BaseEnity {
    @Id
    private String busId;
    private String busName;
    private int capacity;
}

