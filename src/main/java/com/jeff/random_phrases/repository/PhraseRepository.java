package com.jeff.random_phrases.repository;

import com.jeff.random_phrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
    @Query("SELECT p FROM Phrase p ORDER BY FUNCTION('RANDOM') LIMIT 1")
    public Phrase getRandomPhrase();
}
