package com.gestiontaches.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "taches")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String titre;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private String statut; // "A_FAIRE", "EN_COURS", "TERMINE"
}
