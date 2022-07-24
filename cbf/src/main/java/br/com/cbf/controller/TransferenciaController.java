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
import br.com.cbf.model.TimeFutebol;
import br.com.cbf.model.Transferencia;
import br.com.cbf.repository.TransferenciaRepository;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

	@Autowired
	private TransferenciaRepository transferenciaRepository;
	
	@GetMapping
	public ResponseEntity<List<Transferencia>> listarTransferencias(){
		
		return ResponseEntity.ok(transferenciaRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Transferencia> criarTransferencia(@RequestBody Transferencia transferencia) {
		
		return ResponseEntity.ok(transferenciaRepository.saveAndFlush(transferencia));
	}
	
	@PutMapping(path = "/{idTransferencia}")
	public ResponseEntity<Transferencia> atualizarTransferencia(@RequestBody Transferencia transferencia) {
		
		return ResponseEntity.ok(transferenciaRepository.saveAndFlush(transferencia));
	}
	
	
	@DeleteMapping(path = "/{idTransferencia}")
	public ResponseEntity<?> deletarTransferencia(@RequestParam Long idTransferencia){
		return ResponseEntity.noContent().build();
	}
}
