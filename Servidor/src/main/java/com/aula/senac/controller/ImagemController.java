package com.aula.senac.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aula.senac.dto.AutenticacaoDTO;
import com.aula.senac.dto.ImagemDTO;
import com.aula.senac.dto.RetornoAutenticacaoDTO;

@RequestMapping("/")
public interface ImagemController {

	@PostMapping(path = "salvarImagem")
	public abstract List<String> salvarImagem(ImagemDTO imagemDTO) throws Exception;
	
	
	@PostMapping(path = "adquirirImagem")
	public abstract List<String> adquirirImagem() throws Exception;
}
