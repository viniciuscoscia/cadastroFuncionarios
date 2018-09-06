package br.com.vinicius.aplicacaoRestVinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vinicius.aplicacaoRestVinicius.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String>{

}
