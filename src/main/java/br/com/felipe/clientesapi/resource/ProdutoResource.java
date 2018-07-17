package br.com.felipe.clientesapi.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.felipe.clientesapi.model.Produto;
import br.com.felipe.clientesapi.repository.ProdutoRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto> buscarTodos() {
		System.out.println("Buscando todos os produtos...");
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produtos/{id}")
	public Produto buscaPorId(@PathVariable Long id) {
		System.out.println("Buscando produto por id "+id+"...");
		return produtoRepository.findOne(id);
	}
	
	@PostMapping("/produtos")
	public Produto salvar(@RequestBody @Valid Produto produto) {
		System.out.println("Salvando produto...");
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produtos/{id}")
	public void remover(@PathVariable Long id) {
		System.out.println("Removendo produto...");
		produtoRepository.delete(id);
	}
	
	
	
}
