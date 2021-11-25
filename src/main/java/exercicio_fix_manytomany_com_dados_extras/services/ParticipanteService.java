package exercicio_fix_manytomany_com_dados_extras.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercicio_fix_manytomany_com_dados_extras.entities.Participante;
import exercicio_fix_manytomany_com_dados_extras.entities.repositories.ParticipanteRepository;

@Service
public class ParticipanteService {
	
	@Autowired
	private ParticipanteRepository participanteRepository;
	
	public List<Participante> findAll(){
		return participanteRepository.findAll();
	}
	
	public Participante findById(Long id) {
		Optional<Participante> obj = participanteRepository.findById(id);
		return obj.get();
	}
}
