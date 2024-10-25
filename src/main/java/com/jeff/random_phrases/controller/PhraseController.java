package com.jeff.random_phrases.controller;

import com.jeff.random_phrases.model.Phrase;
import com.jeff.random_phrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {
    @Autowired
    private PhraseService service;

    @GetMapping("/phrase")
    public Phrase getPhrase(){
        return service.getRandomPhrase();
    }
}
