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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tk;

    @Column(nullable = false)
    private String mk;

    @Column(nullable = false)
    private String dichi;

    @Column(nullable = false)
    private String sdt;

    @Column(nullable = false)
    private String tenkh;
    
  
}


//npm install @mui/styles  --force