package com.aula.senac.dto;

public class RetornoAutenticacaoDTO {

	private Boolean autentificado;
	private Long codigo;
	private String nome;
	private Boolean contemFotos;
	
	public Boolean getContemFotos() {
		return contemFotos;
	}
	public void setContemFotos(Boolean contemFotos) {
		this.contemFotos = contemFotos;
	}
	public RetornoAutenticacaoDTO() {
		super();
	}
	public RetornoAutenticacaoDTO(Boolean autentificado, Long codigo, String nome,Boolean contemFotos) {
		super();
		this.autentificado = autentificado;
		this.codigo = codigo;
		this.nome = nome;
		this.contemFotos=contemFotos;
	}
	public Boolean getAutentificado() {
		return autentificado;
	}
	public void setAutentificado(Boolean autentificado) {
		this.autentificado = autentificado;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
