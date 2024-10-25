package com.jeff.random_phrases.service;

import com.jeff.random_phrases.model.Phrase;
import com.jeff.random_phrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PhraseService {
    @Autowired
    private PhraseRepository repository;

    public Phrase getRandomPhrase(){
        List<Phrase> phrases = repository.findAll();

        //create random int
        Random random = new Random();
        int randomIndex = random.nextInt(phrases.size());

        Phrase randomPhrase = phrases.stream()
                .skip(randomIndex)
                .findFirst()
                .orElse(null);

        return randomPhrase;
    }
}
