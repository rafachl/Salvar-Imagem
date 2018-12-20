package com.aula.senac.controller.impl;

import java.util.List;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.aula.senac.Repositorio.ImagemUsuario;
import com.aula.senac.controller.AutenticacaoController;
import com.aula.senac.controller.ImagemController;
import com.aula.senac.dto.AutenticacaoDTO;
import com.aula.senac.dto.ImagemDTO;
import com.aula.senac.dto.RetornoAutenticacaoDTO;

@RestController
public class ImagemControllerImpl implements ImagemController {

	@Override
	public List<String> salvarImagem(@RequestBody(required = true) ImagemDTO imagemDTO) throws Exception {
		
		ImagemUsuario.addImagem(imagemDTO.getImagem());

		return ImagemUsuario.getImagens();
	}

	@Override
	public List<String> adquirirImagem() throws Exception {

		return ImagemUsuario.getImagens();
	}

}