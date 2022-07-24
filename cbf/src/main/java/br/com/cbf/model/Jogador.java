package br.com.cbf.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "JOGADOR")
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJogador;
	
	@Column(name = "NM_JOGADOR")
	private String nome;
	
	@Column(name = "IDADE")
	private Integer idade;
	
	@Column(name = "NACIONALIDADE")
	private String nacionalidade;
	
	@Column(name = "VL_MERCADO")
	private BigDecimal valorDeMercado;

//	@ManyToOne
//	@JoinColumn(name = "time_id", referencedColumnName = "id_time")
	@Column(name = "ID_TIME")
	private Long timeFutebol;
	
}
