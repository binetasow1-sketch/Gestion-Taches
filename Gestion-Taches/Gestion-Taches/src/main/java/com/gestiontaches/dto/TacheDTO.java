package com.gestiontaches.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TacheDTO {
    private Long id;
    private String titre;
    private String description;
    private String statut;
}