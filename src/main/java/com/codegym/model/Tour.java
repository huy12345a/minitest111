package com.codegym.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tours")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String destination;
    private String start;
    private String img;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;
}
