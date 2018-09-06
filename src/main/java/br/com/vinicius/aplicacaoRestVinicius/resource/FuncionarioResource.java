package br.com.vinicius.aplicacaoRestVinicius.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicius.aplicacaoRestVinicius.model.Funcionario;
import br.com.vinicius.aplicacaoRestVinicius.repository.FuncionarioRepository;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioRepository fr;
	
	@GetMapping()
	public List<Funcionario> listarFuncionarios() {
		return fr.findAll();
	}
	
	@PostMapping()
	public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {
		return fr.save(funcionario);
	}
	
	@PutMapping()
	public Funcionario updateFuncionario(@RequestBody Funcionario funcionario) {
		return fr.save(funcionario);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable long id) {
		fr.deleteById(String.valueOf(id));
	}

}
