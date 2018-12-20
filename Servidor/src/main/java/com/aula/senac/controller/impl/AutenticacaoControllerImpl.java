package com.aula.senac.controller.impl;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.aula.senac.Repositorio.ImagemUsuario;
import com.aula.senac.controller.AutenticacaoController;
import com.aula.senac.dto.AutenticacaoDTO;
import com.aula.senac.dto.RetornoAutenticacaoDTO;

@RestController
public class AutenticacaoControllerImpl implements AutenticacaoController {

	@Override
	public RetornoAutenticacaoDTO realizarLogin(@RequestBody(required = true) AutenticacaoDTO loginDTO)
			throws Exception {

		if (loginDTO.getLogin().equals("rafael") && loginDTO.getSenha().equals("123")) {
			return new RetornoAutenticacaoDTO(Boolean.TRUE, 1L, "Rafae", ImagemUsuario.getImagens().size() > 0);
		}

		return new RetornoAutenticacaoDTO(Boolean.FALSE, null, null, Boolean.FALSE);

	}
}