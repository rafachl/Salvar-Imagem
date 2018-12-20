package com.aula.senac.Repositorio;

import java.util.ArrayList;
import java.util.List;

public final class ImagemUsuario {

	private List<String> imagens = new ArrayList<>();

    private static ImagemUsuario instance = null;

    public static List<String> getImagens() {
    	if (instance == null) {
            instance = new ImagemUsuario();

        }
		return instance.imagens;
	}

	public  static void addImagem(String imagem) {
		if (instance == null) {
            instance = new ImagemUsuario();

        }
		instance.imagens.add(imagem);
	}




}
