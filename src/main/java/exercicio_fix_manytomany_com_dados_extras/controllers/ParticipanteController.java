package exercicio_fix_manytomany_com_dados_extras.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exercicio_fix_manytomany_com_dados_extras.entities.Participante;
import exercicio_fix_manytomany_com_dados_extras.services.ParticipanteService;

@RestController
@RequestMapping(value ="/api/participantes")
public class ParticipanteController {
	
	@Autowired
	private ParticipanteService participanteService;
	
	@GetMapping
	public ResponseEntity<List<Participante>> findAll(){	
		List<Participante> lista = participanteService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value="/{codigo}")
	public ResponseEntity<Participante> findById(@PathVariable Long codigo){
		Participante obj = participanteService.findById(codigo);
		return ResponseEntity.ok().body(obj);
	}
}
