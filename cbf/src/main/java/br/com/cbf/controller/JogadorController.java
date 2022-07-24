package br.com.cbf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbf.model.Jogador;
import br.com.cbf.repository.JogadorRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

	@Autowired
	private JogadorRepository jogadorRepository;
	
	@GetMapping
	public ResponseEntity<List<Jogador>> listarJogadores(){
		
		return ResponseEntity.ok(jogadorRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Jogador> criarJogador(@RequestBody Jogador jogador) {
		
		return ResponseEntity.ok(jogadorRepository.saveAndFlush(jogador));
	}
	
	@PutMapping(path = "/{idJogador}")
	public ResponseEntity<Jogador> atualizarJogador(@RequestBody Jogador jogador) {
		
		return ResponseEntity.ok(jogadorRepository.saveAndFlush(jogador));
	}
	
	@DeleteMapping(path = "/{idJogador}")
	public ResponseEntity<?> deletarJogador(@RequestParam Long idJogador){
		return ResponseEntity.noContent().build();
	}
	
}
