package br.com.cbf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TITULO_TIME")
public class TituloTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTituloTime;
	
	@Column(name = "TIME_ID")
	private Long idTime;
	
	@Column(name = "TITULO_ID")
	private Long idTitulo;

}
