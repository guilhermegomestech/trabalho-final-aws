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
import org.springframework.web.bind.annotation.RestController;

import br.com.cbf.model.TimeFutebol;
import br.com.cbf.repository.TimeRepository;

@RestController
@RequestMapping("/times")
public class TimeController {

	@Autowired
	private TimeRepository timeRepository;
	
	@GetMapping
	public ResponseEntity<List<TimeFutebol>> listarTimesFutebol(){
		
		return ResponseEntity.ok(timeRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<TimeFutebol> criarTime(@RequestBody TimeFutebol timeFutebol) {
		
		return ResponseEntity.ok(timeRepository.saveAndFlush(timeFutebol));
	}
	
	@PutMapping(path = "/{idTime}")
	public ResponseEntity<TimeFutebol> atualizarTime(@RequestBody TimeFutebol timeFutebol) {
		
		return ResponseEntity.ok(timeRepository.saveAndFlush(timeFutebol));
	}

	@DeleteMapping(path = "/{idTime}")
	public ResponseEntity<?> deletarTime(@RequestBody Long idTime) {
		timeRepository.deleteById(idTime);
		return  ResponseEntity.noContent().build();
	}
}
