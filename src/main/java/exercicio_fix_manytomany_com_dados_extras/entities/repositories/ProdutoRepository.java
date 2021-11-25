package exercicio_fix_manytomany_com_dados_extras.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio_fix_manytomany_com_dados_extras.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
