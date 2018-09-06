package br.com.vinicius.aplicacaoRestVinicius.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private int idade;
	
	@Column
	private String funcao;
	
	@Column
	private boolean isMale;
	
	public Funcionario() {
		super();
	}
	public Funcionario(long id, String nome, int idade, String funcao, boolean isMale) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
		this.isMale = isMale;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
}
