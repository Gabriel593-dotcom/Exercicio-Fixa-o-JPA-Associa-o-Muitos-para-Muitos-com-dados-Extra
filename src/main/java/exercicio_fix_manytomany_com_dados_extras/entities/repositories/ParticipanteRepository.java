package exercicio_fix_manytomany_com_dados_extras.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio_fix_manytomany_com_dados_extras.entities.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long>{

}
