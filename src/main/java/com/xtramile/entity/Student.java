package com.xtramile.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nim;

    private String namaDepan;

    private String namaBelakang;

    private LocalDate tanggalLahir;

}
