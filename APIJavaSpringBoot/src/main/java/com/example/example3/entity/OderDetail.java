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
@Table(name = "oderdetail")
public class OderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String oder_id;

    @Column(nullable = false)
    private String product_id;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String sl;

    
  
}


//npm install @mui/styles  --force