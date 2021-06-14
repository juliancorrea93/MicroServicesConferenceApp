package com.correajulian.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correajulian.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
