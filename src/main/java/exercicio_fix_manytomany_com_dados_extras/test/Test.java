package exercicio_fix_manytomany_com_dados_extras.test;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import exercicio_fix_manytomany_com_dados_extras.entities.Oferta;
import exercicio_fix_manytomany_com_dados_extras.entities.Participante;
import exercicio_fix_manytomany_com_dados_extras.entities.Produto;
import exercicio_fix_manytomany_com_dados_extras.entities.enums.EstadoProduto;
import exercicio_fix_manytomany_com_dados_extras.entities.repositories.OfertaRepository;
import exercicio_fix_manytomany_com_dados_extras.entities.repositories.ParticipanteRepository;
import exercicio_fix_manytomany_com_dados_extras.entities.repositories.ProdutoRepository;

@Configuration
public class Test implements CommandLineRunner {

	@Autowired
	private ParticipanteRepository participanteRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private OfertaRepository ofertaRepository;

	@Override
	public void run(String... args) throws Exception {

		Participante part1 = new Participante(null, "Gabriel");
		Participante part2 = new Participante(null, "Ana");
		Participante part3 = new Participante(null, "Gustavo");

		participanteRepository.saveAll(Arrays.asList(part1, part2, part3));

		Produto prod1 = new Produto(null, "Renalt Duster", 20.000, EstadoProduto.USADO);
		Produto prod2 = new Produto(null, "MC BOOK PRO", 4.000, EstadoProduto.AVARIADO);
		Produto prod3 = new Produto(null, "XBOX SERIES X", 3.000, EstadoProduto.SEMINOVO);

		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));

		Oferta ofer1 = new Oferta(3200.0, Instant.now(), part1, prod3);
		Oferta ofer2 = new Oferta(4500.0, Instant.now(), part1, prod2);
		Oferta ofer3 = new Oferta(3500.0, Instant.now(), part2, prod3);
		Oferta ofer4 = new Oferta(20200.0, Instant.now(), part2, prod1);
		Oferta ofer5 = new Oferta(3200.0, Instant.now(), part3, prod3);
		Oferta ofer6 = new Oferta(4200.0, Instant.now(), part3, prod2);
		Oferta ofer7 = new Oferta(20600.0 , Instant.now(), part3, prod1);
		
		ofertaRepository.saveAll(Arrays.asList(ofer1, ofer2, ofer3, ofer4, ofer5, ofer6, ofer7));
	}

}
