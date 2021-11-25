package exercicio_fix_manytomany_com_dados_extras.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exercicio_fix_manytomany_com_dados_extras.entities.Produto;
import exercicio_fix_manytomany_com_dados_extras.services.ProdutoService;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> lista = produtoService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Produto> findById(@PathVariable Long codigo){
		
		Produto obj = produtoService.findById(codigo);
		return ResponseEntity.ok().body(obj);
	}
}
