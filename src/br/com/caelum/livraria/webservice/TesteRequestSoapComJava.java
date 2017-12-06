package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {

		LivrariaWS cliente = new LivrariaWSProxy();

		Livro[] livros = cliente.getLivrosPorTitulo("Java");
		
		List<Livro> livrosList = Arrays.stream(livros).collect(Collectors.toList());
		
		for (Livro livro : livrosList) {
			System.out.println("Título: " + livro.getTitulo() + " Autor: " + livro.getAutor().getNome());
		}
	}

}