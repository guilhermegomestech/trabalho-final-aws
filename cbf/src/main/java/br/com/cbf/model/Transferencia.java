package br.com.cbf.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TRANSFERENCIA")
public class Transferencia {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTransferencia;
	
	@Column(name = "TIME_ORIGEM")
	private Long timeOrigem;
	
	@Column(name = "TIME_DESTINO")
	private Long timeDestino;
	
	@Column(name = "DT_TRANSFERENCIA")
	private LocalDate dataTransferencia;
	
	@Column(name = "VL_TRANSFERENCIA")
	private BigDecimal valorTransferencia;
	
	@Column(name = "REGISTRADO_BID")
	private Boolean registradoBid;
}
