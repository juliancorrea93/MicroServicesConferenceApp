package com.correajulian.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correajulian.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
