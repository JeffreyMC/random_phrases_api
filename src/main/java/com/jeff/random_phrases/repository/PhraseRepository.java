package com.jeff.random_phrases.repository;

import com.jeff.random_phrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
}
