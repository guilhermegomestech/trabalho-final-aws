package br.com.cbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cbf.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

}
