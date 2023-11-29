package com.example.example3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oder")
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false)
    private String ten;

    @Column(nullable = false)
    private String dichi;

    @Column(nullable = false)
    private String sdt;

    @Column(nullable = false)
    private String sum;
}


//npm install @mui/styles  --force