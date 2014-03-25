package com.moneyblue.infraestructura.persistencia;

import com.moneyblue.dominio.modelo.Cliente;

public interface IClienteRepository {
	
	public Cliente agregarCliente(Cliente cliente);

}
