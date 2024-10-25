package com.jeff.random_phrases.service;

import com.jeff.random_phrases.dto.PhraseDTO;
import com.jeff.random_phrases.model.Phrase;
import com.jeff.random_phrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PhraseService {
    @Autowired
    private PhraseRepository repository;

    public PhraseDTO getRandomPhrase(){
        Phrase phrase = repository.getRandomPhrase();
        return new PhraseDTO(phrase.getSeriesName(), phrase.getPhrase(), phrase.getCharacterName(), phrase.getPoster());
    }
}
