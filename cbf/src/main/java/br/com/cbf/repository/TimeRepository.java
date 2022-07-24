package br.com.cbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cbf.model.TimeFutebol;

public interface TimeRepository extends JpaRepository<TimeFutebol, Long> {

}
