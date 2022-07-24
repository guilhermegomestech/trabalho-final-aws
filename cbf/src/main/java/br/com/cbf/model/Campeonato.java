package br.com.cbf.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CAMPEONATO")
public class Campeonato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCampeonato;
	
	@Column(name = "NM_CAMPEONATO")
	private String nomeCampeonato;
	
	@Column(name = "Vl_PREMIACAO")
	private BigDecimal valorPremiacao;
	
	@Column(name = "ANO")
	private Integer anoCampeonato;
	
}
