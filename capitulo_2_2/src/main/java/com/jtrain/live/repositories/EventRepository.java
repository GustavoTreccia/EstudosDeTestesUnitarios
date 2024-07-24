package com.jtrain.live.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtrain.live.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
