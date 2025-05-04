package com.example.sportesemenynyilvantartorendszer.service;

import com.example.sportesemenynyilvantartorendszer.model.Participant;
import com.example.sportesemenynyilvantartorendszer.repository.ParticipantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {

    private final ParticipantRepository participantRepository;

    @Override
    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    @Override
    public Optional<Participant> findById(Long id) {
        return participantRepository.findById(id);
    }

    @Override
    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public void deleteById(Long id) {
        participantRepository.deleteById(id);
    }
}
