package br.com.cbf.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TIME")
public class TimeFutebol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTime;
	
	@Column(name = "UF")
	private String estadoTime;
	
	@OneToMany(mappedBy = "timeFutebol") 
	private Set<Jogador> listaJogadores;

}
