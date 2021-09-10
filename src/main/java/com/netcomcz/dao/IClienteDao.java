package com.netcomcz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcomcz.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
	

}
