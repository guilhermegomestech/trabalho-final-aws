package br.com.cbf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TITULO")
public class Titulo {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTitulo;
	
	@Column(name = "ID_CAMPEONATO")
	private Long campeonato;

}
