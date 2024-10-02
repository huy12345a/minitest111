package com.codegym.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
