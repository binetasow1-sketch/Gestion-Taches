package com.gestiontaches.service;

import com.gestiontaches.dto.TacheDTO;
import com.gestiontaches.entity.Tache;
import com.gestiontaches.repository.TacheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TacheService {

    private final TacheRepository repository;

    private TacheDTO toDto(Tache entity) {
        return TacheDTO.builder()
                .id(entity.getId())
                .titre(entity.getTitre())
                .description(entity.getDescription())
                .statut(entity.getStatut())
                .build();
    }

    private Tache toEntity(TacheDTO dto) {
        return Tache.builder()
                .id(dto.getId())
                .titre(dto.getTitre())
                .description(dto.getDescription())
                .statut(dto.getStatut())
                .build();
    }

    public List<TacheDTO> findAll() {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    public TacheDTO findById(Long id) {
        return repository.findById(id)
                .map(this::toDto)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));
    }

    public TacheDTO create(TacheDTO dto) {
        Tache saved = repository.save(toEntity(dto));
        return toDto(saved);
    }

    public TacheDTO update(Long id, TacheDTO dto) {
        Tache existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));
        existing.setTitre(dto.getTitre());
        existing.setDescription(dto.getDescription());
        existing.setStatut(dto.getStatut());
        return toDto(repository.save(existing));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}