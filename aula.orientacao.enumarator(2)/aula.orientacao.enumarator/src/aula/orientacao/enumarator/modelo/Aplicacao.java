package aula.orientacao.enumarator.modelo;

import java.time.Month;

import aula.orientacao.enumarator.persistencia.ClientePersistencia;

public class Aplicacao {

	
	public static void main(String[] args) {
		
		
		ClientePersistencia p = new ClientePersistencia();
		
		Cliente c = p.localizarClientePorCPF("000");
		
		System.out.println(c);

		
		//c1.extrato(2023, Month.OCTOBER);
		
		
		
		
		
		
	}
}
