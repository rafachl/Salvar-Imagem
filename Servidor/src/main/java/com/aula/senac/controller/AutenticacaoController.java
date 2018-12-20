package com.aula.senac.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aula.senac.dto.AutenticacaoDTO;
import com.aula.senac.dto.RetornoAutenticacaoDTO;

@RequestMapping("/")
public interface AutenticacaoController {

	@PostMapping(path = "autenticacaoService")
	public abstract RetornoAutenticacaoDTO realizarLogin(AutenticacaoDTO loginDTO) throws Exception;
}
